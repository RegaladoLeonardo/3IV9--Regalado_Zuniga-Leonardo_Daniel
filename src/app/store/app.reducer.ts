import { usersState, usersReducer } from './reducers/users.reducer';
import { ActionReducerMap } from '@ngrx/store';

// tslint:disable-next-line: class-name
export interface appState{
    users: usersState;
}

export const appReducer: ActionReducerMap<appState> = {
    users: usersReducer
};
