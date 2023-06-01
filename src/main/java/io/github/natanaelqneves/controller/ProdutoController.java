package io.github.natanaelqneves.controller;

import io.github.natanaelqneves.model.Produto;
import io.github.natanaelqneves.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoservice;

    public ProdutoController(ProdutoService service){
        this.produtoservice = service;
    }

    @PostMapping
    public String novoProduto(Produto produto){
        produtoservice.adicionaProduto(produto);
        return String.format("%s adicionado(a).", produto.getNome());
    }

    @PutMapping
    public String alteraProduto(Produto produto){
        produtoservice.alteraProduto(produto);
        return String.format("%s alterado.", produto.getNome());
    }

    @DeleteMapping(path = "/{id}")
    public String deletarPorIdProduto(@PathVariable Integer id){
        produtoservice.deletaProduto(id);
        return "Produto deletado.";
    }

    @GetMapping
    public Iterable<Produto> todosOsProdutos(){
        return produtoservice.todosProdutos();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> porIdProduto(@PathVariable Integer id){
        return produtoservice.porIdProduto(id);
    }
}
