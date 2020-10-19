
import { createReducer, on, Action } from '@ngrx/store';
import { UserModel } from '../../models/user.module';
import { loadUsers, loadUsersFail, loadUsersSucccess } from '../actions/users.actions';

// tslint:disable-next-line: class-name
export interface usersState{
    users: UserModel[];
    loaded: boolean;
    loading: boolean;
    error: any;
}

const initState: usersState = {
    users: [],
    loaded: false,
    loading: false,
    error: null
};

// tslint:disable-next-line: variable-name
const _usersReducer = createReducer(
    initState,
    on(loadUsers, state => ({...state, loading: true})),
    on(loadUsersSucccess, (state, {users}) => ({...state, loaded: true, loading: false, users: [...users], error: null})),
    on(loadUsersFail, (state, {payload}) => ({...state, loaded: true, loading: false, error: payload}))
);

export const usersReducer = (state: usersState, action: Action): usersState =>
    _usersReducer(state, action);

