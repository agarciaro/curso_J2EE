package com.cursojavaee.jpa.repository;

import com.cursojavaee.jpa.model.Cliente;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class ClienteRepositoryImpl implements ClienteRepository {
    @PersistenceUnit(unitName = "curso-javaee")
    private EntityManagerFactory emf;

    @Override
    public List<Cliente> findAll(){
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("select c from Cliente c");
        return query.getResultList();
    }

    @Override
    public Cliente insert(Cliente cliente){
        EntityManager em = emf.createEntityManager();
        em.persist(cliente);
        return cliente;
    }
}
