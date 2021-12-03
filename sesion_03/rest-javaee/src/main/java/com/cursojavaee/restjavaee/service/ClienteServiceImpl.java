package com.cursojavaee.restjavaee.service;

import com.cursojavaee.restjavaee.model.Cliente;
import com.cursojavaee.restjavaee.repository.ClienteRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import java.util.List;

@Named
@ApplicationScoped
public class ClienteServiceImpl implements ClienteService{

    @Inject
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Integer id) {
        return null;
    }

    @Override
    public Cliente add(Cliente cliente) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
