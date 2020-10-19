
import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { filter, mergeMap, map, catchError } from 'rxjs/operators';
import { UserService } from '../../services/user.service';
import { loadOnFail, loadUser, loadUserSuccess } from 'src/app/store/actions/user.actions';
import { of } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class UserEffects{

    constructor(
        private actions$: Actions,
        private userService: UserService
    ){
    }

    loadUser$ = createEffect(() =>
        this.actions$.pipe(
                ofType(loadUser),
                mergeMap(({id}) => this.userService.getUserById(id)),
                map( user => loadUserSuccess({user})),
                catchError(err => of(loadOnFail({payload: err})))
            )
    );
}
