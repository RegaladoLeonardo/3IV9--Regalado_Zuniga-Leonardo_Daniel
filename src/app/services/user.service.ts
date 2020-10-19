
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserModel } from '../models/user.module';
import { environment } from 'src/environments/environment';
import { map } from 'rxjs/operators';
import { Data, Response } from '../interfaces/response.interface';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class UserService{

    private url: string;

    constructor(
        private http: HttpClient
    ){
        this.url = environment.url;
    }

    public get getUser(): Observable<UserModel[]>{
        return this.http.get<Response>(`${this.url}/api/users`)
                    .pipe(map((res: Response) => res.data.map( (userR: Data) =>
                            new UserModel(userR.id, userR.email, userR.first_name, userR.last_name, userR.avatar))));
    }
}
