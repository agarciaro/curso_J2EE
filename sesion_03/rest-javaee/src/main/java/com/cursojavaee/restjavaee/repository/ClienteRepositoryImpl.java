package com.cursojavaee.restjavaee.repository;

import com.cursojavaee.restjavaee.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class ClienteRepositoryImpl implements ClienteRepository{

    private final List<Cliente> clientes = new ArrayList<>();

    public ClienteRepositoryImpl(){
        this.clientes.add(new Cliente("cliente1",19, "" ));
        this.clientes.add(new Cliente("cliente2",39, "" ));
        this.clientes.add(new Cliente("cliente3",36, "" ));
    }

    @Override
    public List<Cliente> findAll() {
        return clientes;
    }

    @Override
    public Cliente findById(Integer id) {
        return null;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
