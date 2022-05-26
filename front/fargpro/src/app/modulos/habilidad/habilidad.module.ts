import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HabilidadesComponent } from './habilidades/habilidades.component';
import { HabilidadFormularioComponent } from './habilidad-formulario/habilidad-formulario.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    HabilidadesComponent,
    HabilidadFormularioComponent
  ],
  exports:[
HabilidadesComponent
  ],
  imports: [
 
  CommonModule,
    FormsModule
  ]
})
export class HabilidadModule { }
