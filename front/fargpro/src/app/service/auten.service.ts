import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Usuario } from '../entidades/Usuario';
import { User } from '../entidades/User';
@Injectable({
  providedIn: 'root',
})
export class AutenService {
  url = 'http://localhost:8080/api/login/';
  currentUserSubject: BehaviorSubject<any>;

  constructor(private http: HttpClient) {
    console.log('El servicio de autentificacion esta corriendo');
    this.currentUserSubject = new BehaviorSubject<any>(
      JSON.parse(sessionStorage.getItem('currentUser') || '{}')
    );
  }

  iniciarSesion(credenciales: any): Observable<any> {
    return this.http.post(this.url, credenciales).pipe(
      map((data) => {
        sessionStorage.setItem('currentUser', JSON.stringify(data));

        return data;
      })
    );
  }

 /* iniciarSesion2(user : User){

    this.http.post('http://localhost:8080/api/login',user).subscribe((response) => {

      localStorage.setItem("nombre","guido");
      sessionStorage.setItem("currentUser",JSON.stringify(response));

    });

  }


  iniciarSesion3(user: User) {

    this.http.post("http://localhost:8080/api/login", user).subscribe(repo => {

    localStorage.setItem("miItem", JSON.stringify(repo));

    })
  }
 */
}
