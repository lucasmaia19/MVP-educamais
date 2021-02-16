import {MigrationInterface, QueryRunner} from "typeorm";

export class atividade1613514853866 implements MigrationInterface {
    name = 'atividade1613514853866'

    public async up(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.query("CREATE TABLE `atividade` (`id` int NOT NULL AUTO_INCREMENT, `nome` varchar(255) NOT NULL, PRIMARY KEY (`id`)) ENGINE=InnoDB");
    }

    public async down(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.query("DROP TABLE `atividade`");
    }

}
