import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { LogoComponent } from './componentes/logo/logo.component';
import { BotonesSuperioresComponent } from './componentes/botones-superiores/botones-superiores.component';
import { AcercaComponent } from './componentes/acerca/acerca.component';
import { ExperienciasComponent } from './componentes/experiencias/experiencias.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EstudiosComponent } from './componentes/estudios/estudios.component';
import { EstudioComponent } from './componentes/estudio/estudio.component';
import { HabilidadesComponent } from './componentes/habilidades/habilidades.component';
import { HabilidadComponent } from './componentes/habilidad/habilidad.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { ProyectoComponent } from './componentes/proyecto/proyecto.component';
import {  HttpClientModule } from '@angular/common/http';
import { DatosService } from './service/datos.service';
import { UsuarioService } from './service/usuario.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoComponent,
    BotonesSuperioresComponent,
    AcercaComponent,
    ExperienciasComponent,
    ExperienciaComponent,
    EstudiosComponent,
    EstudioComponent,
    HabilidadesComponent,
    HabilidadComponent,
    ProyectosComponent,
    ProyectoComponent
  ],
  imports: [
  BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
