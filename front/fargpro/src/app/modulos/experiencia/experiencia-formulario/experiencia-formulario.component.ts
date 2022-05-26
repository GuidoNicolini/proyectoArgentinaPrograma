import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';
import { Experiencia } from './../../../entidades/Experiencia';

@Component({
  selector: 'app-experiencia-formulario',
  templateUrl: './experiencia-formulario.component.html',
  styleUrls: ['./experiencia-formulario.component.css']
})
export class ExperienciaFormularioComponent implements OnInit {
  usuario = new Usuario();
  experiencia = new Experiencia();

  constructor(    private usuarioService: UsuarioService,
    private ruta: ActivatedRoute) { }

  ngOnInit(): void {

    let id = Number(this.ruta.snapshot.paramMap.get('id'));

    this.usuarioService.obtenerUsuario(id).subscribe((response) => {
      this.usuario = <Usuario>response;
    });
  }

  modificarExperiencia(){

    
    console.log('listo');
    this.usuario.experiencias.push(this.experiencia);
    this.usuarioService.modificarUsuario(this.usuario);

  }

}
