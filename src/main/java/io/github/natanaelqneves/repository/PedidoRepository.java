package io.github.natanaelqneves.repository;

import io.github.natanaelqneves.model.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PedidoRepository extends CrudRepository<Pedido,Integer>, PagingAndSortingRepository<Pedido, Integer> {
}
