package com.demo.marvelProject.rest;

import com.demo.marvelProject.dto.MarvelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Repository
public class MarvelRest {
    @Autowired
    RestTemplate restTemplate;
    @Value("${marvelCharacters.url}")
    private String urlMarvel;

    @Value("${marvelCharacters.apikey}")
    private String apiKey;

    @Value("${marvelCharacters.hash}")
    private String hash;

    @Value("${marvelCharacters.ts}")
    private String ts;

    private int limit;

    private int offSet;

    public MarvelRest(RestTemplate restTemplate, String urlMarvel, String apiKey, String hash, String ts, int limit, int offSet) {
        this.restTemplate = restTemplate;
        this.urlMarvel = urlMarvel;
        this.apiKey = apiKey;
        this.hash = hash;
        this.ts = ts;
        this.limit = limit;
        this.offSet = offSet;
    }

    public MarvelRest() {
    }

    public MarvelDTO findAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<MarvelDTO> entity = new HttpEntity<MarvelDTO>(headers);
        String url = urlMarvel+"?limit="+limit+"&offset="+offSet+"&apikey="+apiKey+"&hash="+hash+"&ts="+ts;
        MarvelDTO response = restTemplate.exchange(url, HttpMethod.GET, entity, MarvelDTO.class).getBody();
        return response;
    }

    public MarvelDTO findCharacterByID(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<MarvelDTO> entity = new HttpEntity<MarvelDTO>(headers);
        String url = urlMarvel+"/"+id+"?apikey="+apiKey+"&hash="+hash+"&ts="+ts;
        MarvelDTO response = restTemplate.exchange(url, HttpMethod.GET, entity, MarvelDTO.class).getBody();
        return response;
    }

}
