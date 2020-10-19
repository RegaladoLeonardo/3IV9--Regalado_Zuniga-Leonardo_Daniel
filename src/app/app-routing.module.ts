
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './users/list/list.component';
import { UserComponent } from './users/user/user.component';

const APPROUTES: Routes = [
    {path: 'home', component: ListComponent},
    {path: 'user/:id', component: UserComponent},
    {path: '**', pathMatch: 'full', redirectTo: 'home'}
]

@NgModule({
    imports: [
        RouterModule.forRoot(APPROUTES, {useHash: true})
    ],
    exports: [
        RouterModule
    ]
})
export class AppRouting{}
