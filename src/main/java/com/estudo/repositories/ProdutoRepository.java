package com.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
