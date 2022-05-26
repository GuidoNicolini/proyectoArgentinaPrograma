import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';
import { Estudio } from './../../../entidades/Estudio';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-estudio-formulario',
  templateUrl: './estudio-formulario.component.html',
  styleUrls: ['./estudio-formulario.component.css'],
})
export class EstudioFormularioComponent implements OnInit {
  usuario = new Usuario();
  estudio = new Estudio();

  constructor(
    private usuarioService: UsuarioService,
    private ruta: ActivatedRoute
  ) {}

  ngOnInit(): void {
    let id = Number(this.ruta.snapshot.paramMap.get('id'));

    this.usuarioService.obtenerUsuario(id).subscribe((response) => {
      this.usuario = <Usuario>response;
    });
  }

  modificarEstudio() {
    console.log('listo');
    this.usuario.estudios.push(this.estudio);
    this.usuarioService.modificarUsuario(this.usuario);
  }
}
