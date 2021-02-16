package service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import entity.Atividade;
import repository.AtividadeRepository;

@ApplicationScoped
public class AtividadeService {
	
	@Inject
	private AtividadeRepository repository;

	public List<Atividade> listAll() {
		return repository.listAll();
	}

	@Transactional
	public void persist(Atividade atividade) {
		repository.persist(atividade);
	}
	
	@Transactional
    public Atividade update(Long id, Atividade atividade) {
    	Atividade atividadeEntity = Atividade.findById(id);

        if (atividadeEntity == null) {
            throw new WebApplicationException("Food with id of " + id + " does not exist.", Response.Status.NOT_FOUND);
        }

        atividadeEntity.setData(atividade.getData());
        atividadeEntity.setEstado(atividade.getEstado());
        atividadeEntity.setNome(atividade.getNome());
        atividadeEntity.setNota(atividade.getNota());
        
        return atividadeEntity;
    }

}
