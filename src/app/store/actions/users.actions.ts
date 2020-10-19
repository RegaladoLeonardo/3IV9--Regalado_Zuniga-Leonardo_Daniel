
import { Action, createAction, props } from '@ngrx/store';
import { UserModel } from '../../models/user.module';

const loadUsers = createAction('[Users] load');

const loadUsersSucccess = createAction('[Users]', props<{users: UserModel[]}>());

const loadUsersFail = createAction('[Users]', props<{payload: any}>());


export {
    loadUsers,
    loadUsersSucccess,
    loadUsersFail
};
