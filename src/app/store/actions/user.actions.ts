import { createAction, props } from '@ngrx/store';
import { UserModel } from '../../models/user.module';

const loadUser = createAction('[User] loadUser', props<{id: string}>());
const loadUserSuccess = createAction('[User] loadUserSuccess', props<{user: UserModel}>());
const loadOnFail = createAction('[User] loadOnFail', props<{payload: any}>());

export {
    loadUser,
    loadUserSuccess,
    loadOnFail
};
