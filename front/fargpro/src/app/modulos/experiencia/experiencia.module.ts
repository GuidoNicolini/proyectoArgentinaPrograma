import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ExperienciasComponent } from './experiencias/experiencias.component';



@NgModule({
  declarations: [
    ExperienciasComponent
  ],
  exports:[
ExperienciasComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ExperienciaModule { }
