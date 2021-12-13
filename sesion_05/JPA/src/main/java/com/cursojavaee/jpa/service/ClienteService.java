package com.cursojavaee.jpa.service;

import com.cursojavaee.jpa.model.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente insert(Cliente cliente);
}
