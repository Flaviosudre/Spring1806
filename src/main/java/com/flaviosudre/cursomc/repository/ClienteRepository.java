package com.flaviosudre.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flaviosudre.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
