package com.andrey.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrey.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	//Modifiquei o tipo de String para List no metodo
	public List<Categoria> listar() {
		
		//Instanciei dois objetos Categoria conforme o diagrama de classes
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		//Instanciei uma interface do tipo lista utilizando a classe ArrayList que implementa a interface List
		List<Categoria> lista = new ArrayList<>();
		
		//Adicionei os objetos à interface lista
		lista.add(cat1);
		lista.add(cat2);
				
		
		return lista;
		
	}

}
