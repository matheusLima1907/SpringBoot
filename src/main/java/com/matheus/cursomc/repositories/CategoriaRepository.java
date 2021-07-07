package com.matheus.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.cursomc.domain.Categoria;

@Repository //mostra que vai ser uma interface DAO do tipo categoria, serializado por um inteiro
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
