package com.xavier.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xavier.web.domain.Playlist;
import com.xavier.web.repositeries.PlaylistRepositoy;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	@Autowired
	private PlaylistRepositoy playlistRepositoy;
	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	
	//permite executar algumas acoes
	@Override
	public void run(String... args) throws Exception {
		Playlist play1 = new Playlist(null, "Denise - 2022", "Curados para curar!");
		Playlist play2 = new Playlist(null, "Cleopse -2022", "Rock!");
		
		//quem acessa os dados é o repository
		playlistRepositoy.saveAll(Arrays.asList(play1, play2));
		
	}
	
	
	

}
