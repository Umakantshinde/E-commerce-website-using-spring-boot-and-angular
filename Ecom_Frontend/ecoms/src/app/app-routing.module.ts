import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {AdminComponent} from './admin/admin.component';
import {UserComponent} from './user/user.component';
import {LoginComponent} from './login/login.component';
import {ForbiddenComponent} from './forbidden/forbidden.component';


const routes: Routes = [

  {path:'home',component:HomeComponent},
  {path:'admin',component:AdminComponent},
  {path:'user',component:UserComponent},
  {path:'login',component:LoginComponent},
  {path:'forbidden',component:ForbiddenComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
