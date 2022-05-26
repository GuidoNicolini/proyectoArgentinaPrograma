import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EstudioFormularioComponent } from './modulos/estudio/estudio-formulario/estudio-formulario.component';
import { EstudiosComponent } from './modulos/estudio/estudios/estudios.component';
import { ImagenProyectoFormularioComponent } from './modulos/proyecto/imagen-proyecto-formulario/imagen-proyecto-formulario.component';
import { ProyectoFormularioComponent } from './modulos/proyecto/proyecto-formulario/proyecto-formulario.component';
import { ProyectosComponent } from './modulos/proyecto/proyectos/proyectos.component';
const routes: Routes = [
  {
    path: 'estudio/:id', component: EstudioFormularioComponent 
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],

  exports: [RouterModule],
})
export class AppRoutingModule {}
