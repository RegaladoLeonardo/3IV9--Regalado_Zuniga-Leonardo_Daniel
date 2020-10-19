
import { UserModel } from 'src/app/models/user.module';
import { createReducer, Action, on } from '@ngrx/store';
import { loadOnFail, loadUser, loadUserSuccess } from '../actions/user.actions';

// tslint:disable-next-line: class-name
export interface  userState{
    id: string;
    user: UserModel;
    loading: boolean;
    loaded: boolean;
    error: any;
}

const initState: userState = {
    id: null,
    user: null,
    loading: false,
    loaded: false,
    error: null
};

// tslint:disable-next-line: variable-name
const _userReducer = createReducer(
    initState,
    on(loadUser, (state, {id}) => ({...state, id, loading: true})),
    on(loadUserSuccess, (state, {user}) => ({...state, user, loaded: true, loading: false})),
    on(loadOnFail, (state, {payload}) => ({...state, error: payload, loading: false, loaded: true}))
)

export const userReducer = (state: userState, action: Action) =>
    _userReducer(state, action);
