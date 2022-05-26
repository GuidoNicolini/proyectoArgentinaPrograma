import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Habilidad } from 'src/app/entidades/Habilidad';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-habilidad-formulario',
  templateUrl: './habilidad-formulario.component.html',
  styleUrls: ['./habilidad-formulario.component.css'],
})
export class HabilidadFormularioComponent implements OnInit {
  usuario = new Usuario();
  habilidad = new Habilidad();

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

  modificarHabilidad() {
    console.log('listo');
    this.usuario.habilidades.push(this.habilidad);
    this.usuarioService.modificarUsuario(this.usuario);
  }
}
