package com.cursojavaee.jpa.service;

import com.cursojavaee.jpa.model.Cliente;
import com.cursojavaee.jpa.repository.ClienteRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
@Transactional(Transactional.TxType.REQUIRED)
public class ClienteServiceimpl implements ClienteService{

    @Inject
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente insert(Cliente cliente) {
        return clienteRepository.insert(cliente);
    }
}
