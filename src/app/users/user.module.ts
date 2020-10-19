
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { UserComponent } from './user/user.component';
import { ListComponent } from './list/list.component';

@NgModule({
    declarations: [
        UserComponent,
        ListComponent
    ],
    imports: [
        CommonModule
    ],
    exports: [
        UserComponent,
        ListComponent
    ]
})
export class UserModule{}
