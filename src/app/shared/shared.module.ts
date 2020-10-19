
import { NgModule } from '@angular/core';
import { NavBarComponent } from './navbar/navbar.component';
import { RouterModule } from '@angular/router';

@NgModule({
    declarations: [
        NavBarComponent
    ],
    imports: [
        RouterModule
    ],
    exports: [
        NavBarComponent
    ]
})
export class SharedModule{}
