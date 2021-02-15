/* eslint-disable prettier/prettier */
import { TypeOrmModule } from '@nestjs/typeorm';
import { Module } from '@nestjs/common';

import { Atividade } from './atividade.entity';
import { AtividadeController } from './atividade.controller';
import { AtividadeService } from './atividade.service';

@Module({
    imports: [TypeOrmModule.forFeature([Atividade])],
    controllers: [AtividadeController],
    providers: [AtividadeService],
})
export class AtividadeModule {}
