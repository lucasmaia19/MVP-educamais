package repository;

import javax.enterprise.context.ApplicationScoped;

import entity.Atividade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AtividadeRepository implements PanacheRepository<Atividade> {

}
