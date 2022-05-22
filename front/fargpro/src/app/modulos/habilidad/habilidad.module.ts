import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HabilidadesComponent } from './habilidades/habilidades.component';



@NgModule({
  declarations: [
    HabilidadesComponent
  ],
  exports:[
HabilidadesComponent
  ],
  imports: [
    CommonModule
  ]
})
export class HabilidadModule { }
