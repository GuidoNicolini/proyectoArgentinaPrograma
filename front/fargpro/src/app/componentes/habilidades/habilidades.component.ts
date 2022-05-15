import { Component, OnInit } from '@angular/core';
import { DatosUsuario } from 'src/app/entidades/DatosUsuario';
import { Usuario } from 'src/app/entidades/Usuario';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-habilidades',
  templateUrl: './habilidades.component.html',
  styleUrls: ['./habilidades.component.css']
})
export class HabilidadesComponent 
implements OnInit {

  usuarios !: Usuario[];

  constructor(private uService:UsuarioService) { }


 
  ngOnInit(): void {
 
  
  }


}
