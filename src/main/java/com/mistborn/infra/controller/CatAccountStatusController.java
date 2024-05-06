package com.mistborn.infra.controller;

import java.util.List;

import com.mistborn.domain.model.CatAccountStatusDO;
import com.mistborn.domain.service.CatAccountStatusService;
import com.mistborn.infra.controller.response.CatAccountStatusResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/catalogs")
public class CatAccountStatusController {

  private final CatAccountStatusService service;

  public CatAccountStatusController(CatAccountStatusService service) {
    this.service = service;
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/accounts/{id}")
  public CatAccountStatusResponse getById(@PathParam("id") long id) {
    CatAccountStatusDO statusDO = service.getById(id);
    return new CatAccountStatusResponse(statusDO.getId(), statusDO.getDescription(), statusDO.getCreatedAt());
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/accounts/name/{name}")
  public CatAccountStatusResponse getByName(@PathParam("name") String name) {
    CatAccountStatusDO statusDO = service.getByName(name);
    return new CatAccountStatusResponse(statusDO.getId(), statusDO.getDescription(), statusDO.getCreatedAt());
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/accounts")
  public List<CatAccountStatusResponse> findAll() {
    List<CatAccountStatusDO> list = service.findAll();
    return list.stream().map(statusDO -> new CatAccountStatusResponse(statusDO.getId(),
        statusDO.getDescription(), statusDO.getCreatedAt())).toList();
  }

}
