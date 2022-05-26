import { Injectable } from '@angular/core';
import { Proyecto } from '../entidades/Proyecto';
import { Usuario } from '../entidades/Usuario';
import { DatosService } from './datos.service';

@Injectable({
  providedIn: 'root',
})
export class UsuarioService {
  constructor(private datosService: DatosService) {}

  obtenerUsuarios() {
    return this.datosService.getUsuarios();
  }

  obtenerUsuario(id: number) {
    return this.datosService.getUsuario(id);
  }

  crearUsuario(usuario: Usuario): void {
    this.datosService.crearUsuario(usuario);
  }

  modificarUsuario(usuario: Usuario): void {
    this.datosService.cambiarUsuario(usuario);
  }

 /* modificarProyecto(proyecto: Proyecto): void {
    this.datosService.cambiarProyecto(proyecto);
  }

  obtenerProyecto(id: number) {
    return this.datosService.getProyecto(id);
  }*/
}
