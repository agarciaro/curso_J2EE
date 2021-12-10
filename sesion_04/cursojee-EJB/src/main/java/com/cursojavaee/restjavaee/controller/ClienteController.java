package com.cursojavaee.restjavaee.controller;

import com.cursojavaee.restjavaee.annotation.ClienteAlternativo;
import com.cursojavaee.restjavaee.exception.MinimumAgeException;
import com.cursojavaee.restjavaee.model.Cliente;
import com.cursojavaee.restjavaee.model.Clientes;
import com.cursojavaee.restjavaee.service.ClienteService;
import com.cursojavaee.restjavaee.service.ClienteServiceRemote;
import com.cursojavaee.restjavaee.service.Contador;
import com.cursojavaee.restjavaee.service.Saludo;

import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/clientes")
@Produces({"application/json","application/xml"})
public class ClienteController {
    @Inject
    @ClienteAlternativo
    ClienteService clienteService;

    @EJB
    ClienteServiceRemote clienteServiceRemote;

    @Inject
    Contador contador;

    @Inject
    Saludo saludo;

    @GET
    public Response findAllClientes(){
        System.out.println("Contador: " + contador.getCount());
        System.out.println("Saludo: " + saludo.saluda("Aitor"));
        Clientes response = new Clientes(clienteServiceRemote.findAll());
        return Response.ok()
                .status(Response.Status.OK)
                .entity(response)
                .build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Integer idCliente){
        return Response.ok()
                .status(Response.Status.OK)
                .entity(clienteService.findAll().get(idCliente))
                .build();
    }

    @POST
    public Response addCliente(@Valid Cliente cliente){
        if(cliente.getEdad() < 18){
            throw new MinimumAgeException();
        }
        return Response.ok().status(Response.Status.OK).entity(cliente).build();
    }
}
