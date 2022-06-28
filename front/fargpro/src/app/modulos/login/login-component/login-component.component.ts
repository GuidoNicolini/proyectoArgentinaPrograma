import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AutenService } from 'src/app/service/auten.service';
import { User } from './../../../entidades/User';
import { DatosService } from './../../../service/datos.service';


@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
  
  user = new User;

  constructor(private auntenficacion: AutenService,
    private ruta: ActivatedRoute, private datos :DatosService) {

    
   }

  ngOnInit(): void {
    

  }
  

onEnviar(event: Event){
event.preventDefault;
//this.auntenficacion.iniciarSesion3(this.user)
console.log("iniciar sesion evento")
console.log(this.user)

}

}
