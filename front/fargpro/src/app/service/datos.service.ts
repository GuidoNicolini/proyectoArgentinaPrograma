import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class DatosService {

  constructor(private http: HttpClient) { }

  getUsuarios(){

    return this.http.get('http://localhost:8080/api/usuarios');
    
      }
}
