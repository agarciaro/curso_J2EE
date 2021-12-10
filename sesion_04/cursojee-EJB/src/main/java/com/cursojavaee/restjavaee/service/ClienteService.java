package com.cursojavaee.restjavaee.service;

import com.cursojavaee.restjavaee.model.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Integer id);
    public Cliente add(Cliente cliente);
    public void remove(Integer id);
}
