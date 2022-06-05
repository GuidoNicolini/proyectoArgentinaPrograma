import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Proyecto } from 'src/app/entidades/Proyecto';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-proyecto-formulario',
  templateUrl: './proyecto-formulario.component.html',
  styleUrls: ['./proyecto-formulario.component.css']
})
export class ProyectoFormularioComponent implements OnInit {

  usuario = new Usuario();
  proyecto = new Proyecto();

  constructor(    private usuarioService: UsuarioService,
    private ruta: ActivatedRoute) { }

  ngOnInit(): void {

    let id = Number(this.ruta.snapshot.paramMap.get('id'));

    this.usuarioService.obtenerUsuario(id).subscribe((response) => {
      console.log(response);
      this.usuario = <Usuario>response;
    });
  }

  modificarProyecto(){

   
    console.log('listo');
    this.usuario.proyectos.push(this.proyecto);
    this.usuarioService.modificarUsuario(this.usuario);

  }
}
