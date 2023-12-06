package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class StoriesDTO {

    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<StoriesItemDTO> items;

    @JsonProperty("available")
    public Integer getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Integer value) { this.available = value; }

    @JsonProperty("returned")
    public Integer getReturned() { return returned; }
    @JsonProperty("returned")
    public void setReturned(Integer value) { this.returned = value; }

    @JsonProperty("collectionURI")
    public String getCollectionURI() { return collectionURI; }
    @JsonProperty("collectionURI")
    public void setCollectionURI(String value) { this.collectionURI = value; }

    @JsonProperty("items")
    public List<StoriesItemDTO> getItems() { return items; }
    @JsonProperty("items")
    public void setItems(List<StoriesItemDTO> value) { this.items = value; }
}
