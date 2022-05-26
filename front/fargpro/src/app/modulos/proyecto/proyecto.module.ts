import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProyectosComponent } from './proyectos/proyectos.component';
import { ProyectoFormularioComponent } from './proyecto-formulario/proyecto-formulario.component';
import { FormsModule } from '@angular/forms';
import { ImagenProyectoFormularioComponent } from './imagen-proyecto-formulario/imagen-proyecto-formulario.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    ProyectosComponent,
    ProyectoFormularioComponent,
    ImagenProyectoFormularioComponent
  ],
  exports:[
ProyectosComponent
  ],
  imports: [
  
  CommonModule,
    FormsModule,
    RouterModule
  ]
})
export class ProyectoModule { }
