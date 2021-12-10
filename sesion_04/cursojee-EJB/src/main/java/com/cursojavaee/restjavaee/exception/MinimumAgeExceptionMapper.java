package com.cursojavaee.restjavaee.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MinimumAgeExceptionMapper implements ExceptionMapper<MinimumAgeException> {
    @Override
    public Response toResponse(MinimumAgeException e) {
        ErrorMessage message = new ErrorMessage(400, "Mínimo de edar requerido para invocar este método");
        return Response.status(Response.Status.BAD_REQUEST).entity(message).build();
    }
}
