import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { EstudioModule } from './modulos/estudio/estudio.module'
import { ExperienciaModule } from './modulos/experiencia/experiencia.module';
import { HabilidadModule } from './modulos/habilidad/habilidad.module';
import { HeadersModule } from './modulos/headers/headers.module';
import { ProyectoModule } from './modulos/proyecto/proyecto.module';
import { RegistroComponent } from './formularios/registro/registro.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistroComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    EstudioModule,
    ExperienciaModule,
    HabilidadModule,
    HeadersModule,
    ProyectoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
