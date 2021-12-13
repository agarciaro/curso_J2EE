package com.cursojavaee.jpa.repository;

import com.cursojavaee.jpa.model.Cliente;

import java.util.List;

public interface ClienteRepository {
    public List<Cliente> findAll();

    public Cliente insert(Cliente cliente);
}
