package com.cursojavaee.restjavaee.repository;

import com.cursojavaee.restjavaee.model.Cliente;

import java.util.List;

public interface ClienteRepository {
    public List<Cliente> findAll();
    public Cliente findById(Integer id);
    public Cliente save(Cliente cliente);
    public void delete(Integer id);
}
