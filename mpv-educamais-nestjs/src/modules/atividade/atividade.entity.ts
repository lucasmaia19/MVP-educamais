/* eslint-disable prettier/prettier */

import { Column, Entity, PrimaryGeneratedColumn } from 'typeorm';

@Entity('atividade')
export class Atividade {

    @PrimaryGeneratedColumn()
    id: number;

    // @Column()
    // data: Date;

    // @Column()
    // estado: boolean; 

    @Column()
    nota: number;
 
    @Column()
    enunciado: string;

    @Column()
    nome: string;

} 
