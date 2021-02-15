/* eslint-disable prettier/prettier */
import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';

import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AtividadeModule } from './atividade/atividade.module';

@Module({
  imports: [
    TypeOrmModule.forRoot(), AtividadeModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
