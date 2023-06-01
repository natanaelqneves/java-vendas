package io.github.natanaelqneves.service;

import io.github.natanaelqneves.model.Cliente;
import io.github.natanaelqneves.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository repository){
        this.clienteRepository = repository;
    }

    public Cliente adicionaCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    public void deletaCliente(Integer id){
        this.clienteRepository.deleteById(id);
    }

    public Iterable<Cliente> todosClientes(){
        return this.clienteRepository.findAll();
    }

    public void alteraCliente(Cliente cliente){
        this.clienteRepository.save(cliente);
    }

    public Optional<Cliente> porIdCliente(Integer id){
        return this.clienteRepository.findById(id);
    }


}
