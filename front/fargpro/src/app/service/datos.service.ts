import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Usuario } from '../entidades/Usuario';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class DatosService {


  constructor(private http: HttpClient) {}



  getUsuarios() {
    return this.http.get('http://localhost:8080/api/usuarios');
  }

  getUsuario(id:number) {
    return this.http.get(`http://localhost:8080/api/usuarios/${id}`);
  }

  crearUsuario(usuario: Usuario) {
    this.http.post('http://localhost:8080/api/usuarios', usuario).subscribe();
  }

  cambiarUsuario(usuario: Usuario) {
    this.http.patch('http://localhost:8080/api/usuarios', usuario).subscribe();
  }
}
