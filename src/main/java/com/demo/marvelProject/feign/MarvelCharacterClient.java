package com.demo.marvelProject.feign;
import com.demo.marvelProject.dto.MarvelDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedHashMap;

@FeignClient(name="marvelCharacterClient", url = "${marvelCharacters.url}")
public interface MarvelCharacterClient {

    @GetMapping(value = "?apikey=${marvelCharacters.apikey}&hash=${marvelCharacters.hash}&ts=${marvelCharacters.ts}")
    @Headers("Content-Type: application/json")
    MarvelDTO findCharacters();

    @GetMapping(value = "/{idCharacter}?apikey=${marvelCharacters.apikey}&hash=${marvelCharacters.hash}&ts=${marvelCharacters.ts}")
    @Headers("Content-Type: application/json")
    MarvelDTO findCharacterByID(@PathVariable("idCharacter") Integer idCharacter);
}
