import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProyectosComponent } from './proyectos/proyectos.component';



@NgModule({
  declarations: [
    ProyectosComponent
  ],
  exports:[
ProyectosComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ProyectoModule { }
