import { Injectable } from '@angular/core';
import { Usuario } from '../entidades/Usuario';
import { DatosService } from './datos.service';
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private datosService: DatosService) { }

obtenerUsuarios(){

  return this.datosService.getUsuarios();
}

crearUsuario(usuario:Usuario):void{


  this.datosService.crearUsuario(usuario);
  
}


}
