import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { UserModel } from '../../models/user.module';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  public users: UserModel[];

  constructor(
    private userService: UserService
  ){
    this.users = [];
    // this.userService.getUser.subscribe(users => this.users = users);
  }

  ngOnInit(): void {
  }

}
