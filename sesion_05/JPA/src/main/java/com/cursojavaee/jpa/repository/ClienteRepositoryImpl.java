package com.cursojavaee.jpa.repository;

import com.cursojavaee.jpa.model.Cliente;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Stateless
public class ClienteRepositoryImpl implements ClienteRepository {
    /*@PersistenceUnit(unitName = "curso-javaee")
    private EntityManagerFactory emf;*/

    @PersistenceContext(unitName = "curso-javaee")
    private EntityManager em;

    @Override
    public List<Cliente> findAll(){
        //EntityManager em = emf.createEntityManager();
        System.out.println("EN FINDALL");
        Query query = em.createQuery("select c from Cliente c");
        List<Cliente> clientes = query.getResultList();
        Cliente cliente = clientes.get(0);
        System.out.println("-------------------");
        System.out.println("CLIENTE:" + cliente);
        cliente.getFacturas();
        System.out.println("-------------------");
        return clientes;
    }

    @Override
    public Cliente insert(Cliente cliente){
        //EntityManager em = emf.createEntityManager();
        em.persist(cliente);
        //em.flush();
        //em.detach(cliente);
       // cliente.setApellido(cliente.getApellido().toUpperCase());
       // cliente.getPasaporte();
       // em.flush();
        return cliente;
    }
}
