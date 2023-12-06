package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ComicsItemDTO {

    private String resourceURI;
    private String name;

    @JsonProperty("resourceURI")
    public String getResourceURI() { return resourceURI; }
    @JsonProperty("resourceURI")
    public void setResourceURI(String value) { this.resourceURI = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
