package com.xavier.web.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xavier.web.domain.Playlist;
import com.xavier.web.repositeries.PlaylistRepositoy;

@Service
public class PlaylistService {

	
	//criar operaçãoes
	
	@Autowired
	private PlaylistRepositoy repo;
	
	public Playlist buscar(Integer id) {
		Optional<Playlist> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	
}
