/* eslint-disable prettier/prettier */
import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';

import { DeleteResult, Repository, UpdateResult } from 'typeorm';

import { Atividade } from './atividade.entity';

@Injectable()
export class AtividadeService {

    constructor (@InjectRepository(Atividade) private repository: Repository<Atividade>) {}

    async list(): Promise<Atividade[]> {
        return await this.repository.find();
    }

    async listId(id): Promise<Atividade> {
        return await this.repository.findOne(id);
    }

    async  create(atividade: Atividade): Promise<Atividade> {
        return await this.repository.save(atividade);
    }

    async update(atividade: Atividade): Promise<UpdateResult> {
        return await this.repository.update(atividade.id, atividade);
    }

    async delete(id): Promise<DeleteResult> {
        return await this.repository.delete(id);
    }

}
