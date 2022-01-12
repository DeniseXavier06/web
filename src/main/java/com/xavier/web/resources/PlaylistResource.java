package com.xavier.web.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.web.domain.Playlist;

@RestController
@RequestMapping(value="/playlists")
public class PlaylistResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Playlist> listar() {
		

	Playlist play1 = new Playlist(1,"Denise xavier", "Acústico 2020");
	
	List<Playlist> lista = new ArrayList<>();
	lista.add(play1);
			
			return lista;
	}
	
}
