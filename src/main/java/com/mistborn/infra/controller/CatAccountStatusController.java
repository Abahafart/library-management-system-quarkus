package com.mistborn.infra.controller;

import com.mistborn.domain.model.CatAccountStatusDO;
import com.mistborn.domain.service.CatAccountStatusService;
import com.mistborn.infra.controller.response.CatAccountStatusResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/accounts")
public class CatAccountStatusController {

  private final CatAccountStatusService service;

  public CatAccountStatusController(CatAccountStatusService service) {
    this.service = service;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/status/{id}")
  public CatAccountStatusResponse getById(long id) {
    CatAccountStatusDO statusDO = service.getById(id);
    return new CatAccountStatusResponse(statusDO.getId(), statusDO.getDescription(), statusDO.getCreatedAt());
  }

}
