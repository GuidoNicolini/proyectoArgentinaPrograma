import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Proyecto } from 'src/app/entidades/Proyecto';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';
import { ImagenProyecto } from './../../../entidades/ImagenProyecto';

@Component({
  selector: 'app-imagen-proyecto-formulario',
  templateUrl: './imagen-proyecto-formulario.component.html',
  styleUrls: ['./imagen-proyecto-formulario.component.css'],
})
export class ImagenProyectoFormularioComponent /*implements OnInit*/ {
  usuario = new Usuario();
  proyecto = new Proyecto();
  imagenProyecto = new ImagenProyecto();

  constructor(
    private usuarioService: UsuarioService,
    private ruta: ActivatedRoute
  ) {}

 
 ngOnInit(): void {
    let id = Number(this.ruta.snapshot.paramMap.get('id'));

    this.usuarioService.obtenerProyecto(id).subscribe((response) => {
      console.log("mira esta respuesta: " + response)
      this.proyecto = <Proyecto>response;
    });
  }

  modificarImagenProyecto() {
    console.log('listo');
    console.log(this.proyecto);

    this.proyecto.imagenes.push(this.imagenProyecto);
    this.usuarioService.modificarProyecto(this.proyecto);
  }


}



