/* eslint-disable prettier/prettier */

import { Atividade } from './atividade.entity';
import { Body, Controller, Get, Post, Param, Put, Delete } from '@nestjs/common';

import { AtividadeService } from './atividade.service';

@Controller('atividade')
export class AtividadeController {

  constructor(private service: AtividadeService) {} 

  @Get('')
  list() {
    return this.service.list();
  }

  @Post('')
  async create(@Body() atividade: Atividade): Promise<any> {
    return this.service.create(atividade);
  }

  @Put(':id')
  async update(@Param('id') id, @Body() atividade: Atividade): Promise<any> {
    atividade.id = Number(id);
      console.log('Update #' + atividade.id)
      return this.service.update(atividade);
  }  

  @Delete(':id/')
  async delete(@Param('id') id): Promise<any> {
    return this.service.delete(id);
  }  

}
