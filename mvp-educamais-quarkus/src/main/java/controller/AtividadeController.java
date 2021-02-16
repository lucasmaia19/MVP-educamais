package controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import entity.Atividade;
import service.AtividadeService;

@Path("/atividade")
public class AtividadeController {

	@Inject
	private AtividadeService service;

    @GET
    public List<Atividade> listAll() {
    	return service.listAll();

    }

    @POST
    public void persist(Atividade atividade) {
        service.persist(atividade);
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        Atividade foodEntity = Atividade.findById(id);

        if (foodEntity == null) {
            throw new WebApplicationException("Food with id " + id + " does not exist.", Response.Status.NOT_FOUND);
        }

        foodEntity.delete();
        return Response.status(204).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, Atividade atividade) {

        Atividade atividadeAtualizada = service.update(id, atividade);

        return Response.ok(atividadeAtualizada).build();
    }

}
