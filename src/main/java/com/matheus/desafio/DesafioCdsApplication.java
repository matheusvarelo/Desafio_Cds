package com.matheus.desafio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matheus.desafio.domain.Categoria;
import com.matheus.desafio.repository.CategoriaRepository;

@SpringBootApplication
public class DesafioCdsApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioCdsApplication.class, args);
	}
 
	@Override
	public void run(String... arg0) throws Exception {
		
		Categoria cat1 =new Categoria(null,"Carlos","125152185");
		
		categoriaRepository.save(Arrays.asList(cat1));
		
		
	}
	
	
}
