package com.flaviosudre.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviosudre.cursomc.domain.Categoria;
import com.flaviosudre.cursomc.exceptions.ObjectNotFoundException;
import com.flaviosudre.cursomc.repository.CategoriaRepository;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. " + id + ", tipo : " + Categoria.class.getName());
			
		}
		
		return obj.orElse(null);
	
	}	
	
}
