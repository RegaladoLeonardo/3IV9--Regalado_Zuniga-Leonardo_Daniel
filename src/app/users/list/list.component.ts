import { Component, OnDestroy, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { UserModel } from '../../models/user.module';
import { Store } from '@ngrx/store';
import { appState } from '../../store/app.reducer';
import { loadUsers } from 'src/app/store/actions/users.actions';
import { Subscription } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit, OnDestroy {

  public users: UserModel[];
  public subscription: Subscription;
  public loading: boolean;
  public error: any;

  constructor(
    private userService: UserService,
    private store: Store<appState>,
    private roiter: Router
  ){
    this.loading = true;
    this.error = null;
    this.users = [];
    // this.userService.getUser.subscribe(users => this.users = users);
    this.store.dispatch(loadUsers());
    this.subscription  = this.store.select('users').subscribe(({users, loading, error}) => {
      this.users = users;
      this.loading = loading;
      this.error = error;
    });
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  ngOnInit(): void {
  }

  public searchUser = (id: string): Promise<boolean> =>
        this.roiter.navigateByUrl(`user/${id}`)
}
