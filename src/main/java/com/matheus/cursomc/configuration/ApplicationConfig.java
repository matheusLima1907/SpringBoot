package com.matheus.cursomc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.matheus.cursomc.repositories.CategoriaRepository;

import com.matheus.cursomc.domain.Categoria;

@Configuration
public class ApplicationConfig {

	@Autowired
	private CategoriaRepository repo;

	@Bean //executa o metodo no start da aplicação e se o metodo tiver retorno ele deixa uma instancia ativa na aplicação
	void createDefaultCategorias(){

		Categoria categoria1 = new Categoria(1, "Informatica");
		Categoria categoria2 = new Categoria(2, "Escritório");
		
		repo.save(categoria1);
		repo.save(categoria2);
	}
}