package io.github.natanaelqneves.service;

import io.github.natanaelqneves.model.Produto;
import io.github.natanaelqneves.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository pRepository){
        this.produtoRepository = pRepository;
    }

    public Produto adicionaProduto(Produto produto){
        return this.produtoRepository.save(produto);
    }

    public void deletaProduto(Integer id){
        this.produtoRepository.deleteById(id);
    }

    public Iterable<Produto> todosProdutos(){
        return this.produtoRepository.findAll();
    }

    public void alteraProduto(Produto produto){
        this.produtoRepository.save(produto);
    }

    public Optional<Produto> porIdProduto(Integer id){
        return this.produtoRepository.findById(id);
    }
}
