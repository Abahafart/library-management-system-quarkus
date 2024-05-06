package com.mistborn.infra.controller;

import com.mistborn.domain.exceptions.RecordNotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundHandler implements ExceptionMapper<RecordNotFoundException> {

  @Override
  public Response toResponse(RecordNotFoundException e) {
    return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
  }
}
