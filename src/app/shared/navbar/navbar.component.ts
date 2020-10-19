
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-nav-bar',
    templateUrl: './navbar.component.html',
    styleUrls: ['./navbar.component.css']
})
export class NavBarComponent{

    constructor(
        private router: Router
    ){}

    public onSearch = (field: string): void => {
        if (field.length > 0){
            this.router.navigateByUrl(`user/${field}`);
        }
    }
}
