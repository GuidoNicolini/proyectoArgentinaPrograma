
import { ImagenProyecto } from './ImagenProyecto';
import { Usuario } from './Usuario';

export class Proyecto{

    id!: number;
    nombre!: string;
    fechaInicio !: string;
    fechaFinalizacion !: string;
    descripcion !: string;
    enlace!: string;
    imagenes !: ImagenProyecto[];
    usuario !: Usuario;
}