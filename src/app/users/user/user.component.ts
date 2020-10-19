
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Store } from '@ngrx/store';
import { loadUser } from 'src/app/store/actions/user.actions';
import { appState } from '../../store/app.reducer';
import { UserModel } from '../../models/user.module';

@Component({
    selector: 'app-user',
    templateUrl: './user.component.html',
    styleUrls: ['./user.component.css']
})
export class UserComponent{

    private id: string;
    public user: UserModel;
    public loading: boolean;
    public error: any;

    constructor(
        private activatedRoute: ActivatedRoute,
        private store: Store<appState>
    ){
        this.user = null;
        this.error = null;
        this.activatedRoute.params.subscribe(({id}) => this.store.dispatch(loadUser({id})));
        this.store.select('user').subscribe(({user, loading, error}) => {
            this.user = user;
            this.loading = loading;
            this.error = error;
        });
    }
}
