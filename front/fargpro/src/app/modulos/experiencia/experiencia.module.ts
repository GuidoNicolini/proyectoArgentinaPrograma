import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ExperienciasComponent } from './experiencias/experiencias.component';
import { ExperienciaFormularioComponent } from './experiencia-formulario/experiencia-formulario.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    ExperienciasComponent,
    ExperienciaFormularioComponent
  ],
  exports:[
ExperienciasComponent
  ],
  imports: [
  
  CommonModule,
    FormsModule
  ]
})
export class ExperienciaModule { }
