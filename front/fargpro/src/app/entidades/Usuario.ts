import {DatosUsuario} from "./DatosUsuario";
import { Experiencia } from './Experiencia';
import { Estudio } from './Estudio';
import { Habilidad } from "./Habilidad";
import { Proyecto } from './Proyecto';
import { RedSocial } from "./RedSocial";
import { Injectable } from "@angular/core";


//@Injectable({ providedIn: 'root'})
export class Usuario {

  id!: number;
  datosUsuario !: DatosUsuario;
  experiencias !: Experiencia[];
  estudios !: Estudio[];
  habilidades !: Habilidad[];
  proyectos !: Proyecto[];
  redesSociales !: RedSocial[];
  

  }