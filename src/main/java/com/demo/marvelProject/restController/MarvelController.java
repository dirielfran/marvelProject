package com.demo.marvelProject.restController;

import java.io.IOException;
import java.util.*;

import com.demo.marvelProject.dto.MarvelDTO;
import com.demo.marvelProject.feign.MarvelCharacterClient;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
public class MarvelController {

	private final MarvelCharacterClient marvelCharacterClient;

	@Autowired
	public MarvelController(MarvelCharacterClient marvelCharacterClient) {
		this.marvelCharacterClient = marvelCharacterClient;
	}



	@GetMapping("buscar")
	MarvelDTO buscarCharacters() {
		MarvelDTO response= marvelCharacterClient.findCharacters();
		return response;
	}

	@GetMapping("buscar/{id}")
	MarvelDTO buscarCharacterByID(@PathVariable Integer id) {
		MarvelDTO response=  marvelCharacterClient.findCharacterByID(id);
		return response;
	}


}