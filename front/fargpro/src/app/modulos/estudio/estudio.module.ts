import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EstudiosComponent } from './estudios/estudios.component';
import { EstudioFormularioComponent } from './estudio-formulario/estudio-formulario.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    EstudiosComponent,
    EstudioFormularioComponent
  ],
  exports:[
    EstudiosComponent,
    EstudioFormularioComponent
  ],
  imports: [
 
  CommonModule,
    FormsModule,
    RouterModule,

  ]
})
export class EstudioModule { }
