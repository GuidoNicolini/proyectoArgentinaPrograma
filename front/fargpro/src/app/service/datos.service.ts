import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Usuario } from '../entidades/Usuario';

@Injectable({
  providedIn: 'root'
})


export class DatosService {

  constructor(private http: HttpClient) {}



  getUsuarios(){

    return this.http.get("http://localhost:8080/api/usuarios");
    
      }

  crearUsuario(usuario:Usuario){

    this.http.post("http://localhost:8080/api/usuarios",usuario).subscribe(

    response => console.log("Se ha guardado con exito: " + response),

    error => console.log("error: " + error),
    
    )

  }

    
}

