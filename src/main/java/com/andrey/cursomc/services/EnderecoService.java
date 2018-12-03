package com.andrey.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrey.cursomc.domain.Endereco;
import com.andrey.cursomc.repositories.EnderecoRepository;
import com.andrey.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco buscar(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()));
		}	
	
}
