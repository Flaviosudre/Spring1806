package com.flaviosudre.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviosudre.cursomc.domain.Cliente;
import com.flaviosudre.cursomc.exceptions.ObjectNotFoundException;
import com.flaviosudre.cursomc.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. " + id + ", tipo : " + Cliente.class.getName());
			
		}
		
		return obj.orElse(null);
	
	}	
	
}
