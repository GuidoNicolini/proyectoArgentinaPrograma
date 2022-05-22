import { Component, OnInit } from '@angular/core';
import {DatosUsuario} from 'src/app/entidades/DatosUsuario';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';


@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',

})
export class RegistroComponent implements OnInit {

 
  usuario= new Usuario;
  datosUsuario = new DatosUsuario;

  constructor(private usuarioService : UsuarioService) {}

  ngOnInit(): void {

    
     this.usuarioService.obtenerUsuario().subscribe(
      response => {
        this.usuario = <Usuario>response;
        this.datosUsuario = this.usuario.datosUsuario;
      }
      
)

  }

  agregar(){
   
   // this.usuario.datosUsuario = this.datosUsuario;
    this.usuarioService.crearUsuario(this.usuario);
  }

  modificar(){
  
this.usuario.datosUsuario = this.datosUsuario;

   /*  this.usuarioService.obtenerUsuario().subscribe(
      usuarioUnico => {
       let usuarioAuxiliar:Usuario = <Usuario>usuarioUnico;
        let id:number = usuarioAuxiliar.id;

        this.usuario = <Usuario>usuarioUnico;
        this.usuario.id = id;
      
      }
    )*/


   // this.usuario.datosUsuario.nombre = this.datosUsuario.nombre;
   // this.usuario.datosUsuario.apellido = this.datosUsuario.apellido;

   console.log(this.usuario.datosUsuario.nombre);
   console.log(this.usuario.datosUsuario.apellido);
   
   this.usuarioService.modificarUsuario(this.usuario);
  }

}
