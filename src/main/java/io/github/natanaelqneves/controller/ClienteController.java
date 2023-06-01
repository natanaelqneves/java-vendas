package io.github.natanaelqneves.controller;

import io.github.natanaelqneves.model.Cliente;
import io.github.natanaelqneves.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController( ClienteService service){
        this.clienteService = service;
    }

    @PostMapping
    public String novoCliente(Cliente cliente){
        clienteService.adicionaCliente(cliente);
        return String.format("%s adicionado(a).", cliente.getNome());
    }

    @PutMapping
    public String alteraCliente(Cliente cliente){
        clienteService.alteraCliente(cliente);
        return String.format("%s alterado(a).", cliente.getNome());
    }

    @DeleteMapping(path = "/{id}")
    public String deletarPorIdCLiente(@PathVariable Integer id){
        clienteService.deletaCliente(id);
        return "Conta deletada.";
    }

    @GetMapping
    public Iterable<Cliente> todosOsClientes(){
        return clienteService.todosClientes();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> porIdCliente(@PathVariable Integer id){
        return clienteService.porIdCliente(id);
    }
}
