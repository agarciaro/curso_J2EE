package com.cursojavaee.restjavaee.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class validationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException e) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(400);
        for(ConstraintViolation<?> cv: e.getConstraintViolations()){
            errorMessage.setDescription(errorMessage.getDescription() + cv.getPropertyPath() + " " + cv.getMessage() + "\n");
        }
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}
