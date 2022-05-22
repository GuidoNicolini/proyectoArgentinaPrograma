import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AcercaComponent } from './acerca/acerca.component';
import { BotonesSuperioresComponent } from './botones-superiores/botones-superiores.component';
import { HeaderComponent } from './header/header.component';
import { LogoComponent } from './logo/logo.component';



@NgModule({
  declarations: [
    AcercaComponent,
    BotonesSuperioresComponent,
    HeaderComponent,
    LogoComponent
  ],
  exports:[
    AcercaComponent,
    BotonesSuperioresComponent,
    HeaderComponent,
    LogoComponent
  ],
  imports: [
    CommonModule
  ]
})
export class HeadersModule { }
