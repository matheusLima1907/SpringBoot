package com.matheus.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //mostra que a classe é uma rest controller 
@RequestMapping(value="/categorias") //mostra que a mesma corresponde ao endpoint /categorias
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)//mostra que a requisição será do metodo get
	public String listar() {
		return "Rest está funcionando!";
	}
	
		
}
