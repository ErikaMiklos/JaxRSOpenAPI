package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.ProfDao;
import fr.istic.taa.jaxrs.domain.Prof;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

@Path("/prof")
@Produces({"application/json"})
public class ProfResource {

  ProfDao profDao = new ProfDao();

  @GET
  @Path("/{id}")
  public Prof getProfById(@PathParam("id") Long id)  {
      // return prof
      return profDao.getProfById(id);
  }
/*
  @POST
  @Consumes("application/json")
  public Response addProf(
      @Parameter(description = "Prof object that needs to be added to the store", required = true) Prof prof) {
    // add pet
    return Response.ok().entity("SUCCESS").build();
  }*/
}