/* eslint-disable prettier/prettier */

import { Column, Entity, Long, PrimaryGeneratedColumn } from 'typeorm';

@Entity('atividade')
export class Atividade {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    data: Date;

    @Column()
    estado: boolean;
    
    @Column()
    nota: Long;

    @Column()
    nome: string;

}
