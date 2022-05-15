import { Usuario } from './Usuario';

export class Experiencia{
    
    id !: number;
    empresa!: string;
    puesto!: string;
    fechaInicio !: string;
    fechaFinalizacion !: string;
    descripcion !: string;
    usuario !: Usuario;
}