import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EstudiosComponent } from './estudios/estudios.component';



@NgModule({
  declarations: [
    EstudiosComponent
  ],
  exports:[
    EstudiosComponent
  ],
  imports: [
    CommonModule
  ]
})
export class EstudioModule { }
