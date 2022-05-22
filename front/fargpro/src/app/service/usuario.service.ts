import { Injectable } from '@angular/core';
import { Usuario } from '../entidades/Usuario';
import { DatosService } from './datos.service';
import { DatosUsuario } from '../entidades/DatosUsuario';
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private datosService: DatosService) { }

obtenerUsuarios(){

  return this.datosService.getUsuarios();
}

obtenerUsuario(){

  return this.datosService.getUsuario();
}

crearUsuario(usuario:Usuario):void{


  this.datosService.crearUsuario(usuario);
  
}

modificarUsuario(usuario:Usuario):void{

  this.datosService.cambiarUsuario(usuario);

}

}
