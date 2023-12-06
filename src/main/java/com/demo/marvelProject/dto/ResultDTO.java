package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {
    private Integer id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private List<UrlDTO> urls;
    private ThumbnailDTO thumbnail;
    private ComicsDTO comics;
    private StoriesDTO storiesDTO;
    private ComicsDTO events;
    private ComicsDTO series;

    @JsonProperty("id")
    public Integer getID() { return id; }
    @JsonProperty("id")
    public void setID(Integer value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("modified")
    public Date getModified() { return modified; }
    @JsonProperty("modified")
    public void setModified(Date value) { this.modified = value; }

    @JsonProperty("resourceURI")
    public String getResourceURI() { return resourceURI; }
    @JsonProperty("resourceURI")
    public void setResourceURI(String value) { this.resourceURI = value; }

    @JsonProperty("urls")
    public List<UrlDTO> getUrls() { return urls; }
    @JsonProperty("urls")
    public void setUrls(List<UrlDTO> value) { this.urls = value; }

    @JsonProperty("thumbnail")
    public ThumbnailDTO getThumbnail() { return thumbnail; }
    @JsonProperty("thumbnail")
    public void setThumbnail(ThumbnailDTO value) { this.thumbnail = value; }

    @JsonProperty("comics")
    public ComicsDTO getComics() { return comics; }
    @JsonProperty("comics")
    public void setComics(ComicsDTO value) { this.comics = value; }

    @JsonProperty("stories")
    public StoriesDTO getStories() { return storiesDTO; }
    @JsonProperty("stories")
    public void setStories(StoriesDTO value) { this.storiesDTO = value; }

    @JsonProperty("events")
    public ComicsDTO getEvents() { return events; }
    @JsonProperty("events")
    public void setEvents(ComicsDTO value) { this.events = value; }

    @JsonProperty("series")
    public  ComicsDTO getSeries() { return series; }
    @JsonProperty("series")
    public void setSeries(ComicsDTO value) { this.series = value; }
}
