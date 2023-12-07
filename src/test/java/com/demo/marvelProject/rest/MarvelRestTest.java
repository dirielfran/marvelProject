package com.demo.marvelProject.rest;

import com.demo.marvelProject.dto.MarvelDTO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {MarvelRest.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class MarvelRestTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private MarvelRest marvelRest;


    @Test
    void findAll() {
        MarvelDTO expectedResponse = new MarvelDTO();
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(HttpEntity.class), eq(MarvelDTO.class)))
                .thenReturn(new ResponseEntity<>(expectedResponse, HttpStatus.OK));

        MarvelDTO actualResponse = marvelRest.findAll();
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void findCharacterByID() {
        Integer characterId = 123;
        MarvelDTO expectedResponse = new MarvelDTO();
        when(restTemplate.exchange(anyString(), eq(HttpMethod.GET), any(HttpEntity.class), eq(MarvelDTO.class)))
                .thenReturn(new ResponseEntity<>(expectedResponse, HttpStatus.OK));

        MarvelDTO actualResponse = marvelRest.findCharacterByID(characterId);
        assertEquals(expectedResponse, actualResponse);
    }
}