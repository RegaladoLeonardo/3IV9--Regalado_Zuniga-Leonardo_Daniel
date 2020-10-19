
import { Injectable } from '@angular/core';
import { Actions, createEffect, EffectConfig, ofType } from '@ngrx/effects';
import { mergeMap, tap, map, catchError } from 'rxjs/operators';
import { loadUsers, loadUsersFail, loadUsersSucccess } from '../actions/users.actions';
import { UserService } from '../../services/user.service';
import { Store, Action } from '@ngrx/store';
import { appState } from '../app.reducer';
import { of } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class UsersEffects{

    constructor(
        private action$: Actions,
        private userService: UserService,
        private store: Store<appState>
    ){
    }

    loadUsers$ = createEffect<any, any, any, any>(() =>
        this.action$.pipe(
            ofType(loadUsers.type),
            mergeMap(() => this.userService.getUser
                        .pipe( map(users => loadUsersSucccess({users})),
                            catchError(payload => of(loadUsersFail({payload})))
                        ))
            )
    );
}
