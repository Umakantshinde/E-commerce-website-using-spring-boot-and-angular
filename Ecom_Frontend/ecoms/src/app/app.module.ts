import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { ForbiddenComponent } from './forbidden/forbidden.component';
import {HttpClientModule}from '@angular/common/http';
import {RouterModule} from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    UserComponent,
    LoginComponent,
    HeaderComponent,
    ForbiddenComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,
    HttpClientModule,
    RouterModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
