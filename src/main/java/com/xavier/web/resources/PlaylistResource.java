package com.xavier.web.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.web.domain.Playlist;
import com.xavier.web.services.PlaylistService;

@RestController
@RequestMapping(value="/playlists")
public class PlaylistResource {

	@Autowired
	private PlaylistService service;
	
	//realizando a busca no banco
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Playlist obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
