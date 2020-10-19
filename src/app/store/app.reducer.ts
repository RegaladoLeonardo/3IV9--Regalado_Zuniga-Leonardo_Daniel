import { usersState, usersReducer } from './reducers/users.reducer';
import { ActionReducerMap } from '@ngrx/store';
import { userState, userReducer } from './reducers/user.reducer';

// tslint:disable-next-line: class-name
export interface appState{
    users: usersState;
    user: userState;
}

export const appReducer: ActionReducerMap<appState> = {
    users: usersReducer,
    user: userReducer
};
