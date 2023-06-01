package io.github.natanaelqneves.repository;

import io.github.natanaelqneves.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Integer>, PagingAndSortingRepository<Cliente, Integer> {
}
