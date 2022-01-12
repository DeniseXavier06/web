package com.xavier.web.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xavier.web.domain.Categoria;
import com.xavier.web.repositeries.CategoriaRepositoy;


@Service
public class CategoriaService {

	
	//criar operaçãoes
	
	@Autowired
	private CategoriaRepositoy repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	
}
