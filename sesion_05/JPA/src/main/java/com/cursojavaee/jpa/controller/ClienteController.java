package com.cursojavaee.jpa.controller;

import com.cursojavaee.jpa.model.Cliente;
import com.cursojavaee.jpa.service.ClienteService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/clientes")
@Produces("application/json")
public class ClienteController {

    @Inject
    ClienteService clienteService;

    @GET
    public Response findAll(){
        return Response.ok()
                .status(Response.Status.OK)
                .entity(clienteService.findAll())
                .build();
    }

    @POST
    public Response insert(Cliente cliente){
        clienteService.insert(cliente);
        return Response.ok()
                .status(Response.Status.OK)
                .entity(clienteService.findAll())
                .build();
    }

}
