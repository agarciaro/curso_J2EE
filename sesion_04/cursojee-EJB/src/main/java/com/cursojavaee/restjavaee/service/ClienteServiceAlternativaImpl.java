package com.cursojavaee.restjavaee.service;

import com.cursojavaee.restjavaee.annotation.ClienteAlternativo;
import com.cursojavaee.restjavaee.model.Cliente;
import com.cursojavaee.restjavaee.repository.ClienteRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

@Stateless
@ClienteAlternativo
public class ClienteServiceAlternativaImpl implements ClienteService{

    @Inject
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        System.out.println("FindAll Alternativa");
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
