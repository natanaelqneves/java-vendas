package io.github.natanaelqneves.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @GetMapping
    public String novoPedido(){
        return "Pagina de novo pedido.";
    }
}
