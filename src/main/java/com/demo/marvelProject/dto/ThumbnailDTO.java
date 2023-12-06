package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ThumbnailDTO {
    private String path;
    private String extension;

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("extension")
    public String getExtension() { return extension; }
    @JsonProperty("extension")
    public void setExtension(String value) { this.extension = value; }

}
