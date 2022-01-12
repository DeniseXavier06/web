package com.xavier.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xavier.web.domain.Categoria;
import com.xavier.web.domain.Playlist;
import com.xavier.web.repositeries.CategoriaRepositoy;
import com.xavier.web.repositeries.PlaylistRepositoy;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	@Autowired

	private CategoriaRepositoy categoriaRepositoy;
	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	
	//permite executar algumas acoes
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Negócios");
		Categoria cat2 = new Categoria(null, "Cores");
		
		//quem acessa os dados é o repository
		categoriaRepositoy.saveAll(Arrays.asList(cat1,cat2));
		
	}
	
	
	

}
