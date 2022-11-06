import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserAuthService } from './user-auth.service';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  PATH_OF_API = "http://localhost:9090";

  requestHeader = new HttpHeaders({ "No-Auth": "True" });
  constructor(
    private httpclient: HttpClient,
    private userAuthService: UserAuthService
  ) {}

  public login(loginData) {
  
    return this.httpclient.post(
      this.PATH_OF_API+"/authenticate",
     loginData, {
      headers: this.requestHeader
    });
  }
}
