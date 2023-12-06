package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MarvelDTO {

        private Integer code;
        private String status;
        private String copyright;
        private String attributionText;
        private String attributionHTML;
        private DataDTO data;
        private String etag;

        @JsonProperty("code")
        public Integer getCode() { return code; }
        @JsonProperty("code")
        public void setCode(Integer value) { this.code = value; }

        @JsonProperty("status")
        public String getStatus() { return status; }
        @JsonProperty("status")
        public void setStatus(String value) { this.status = value; }

        @JsonProperty("copyright")
        public String getCopyright() { return copyright; }
        @JsonProperty("copyright")
        public void setCopyright(String value) { this.copyright = value; }

        @JsonProperty("attributionText")
        public String getAttributionText() { return attributionText; }
        @JsonProperty("attributionText")
        public void setAttributionText(String value) { this.attributionText = value; }

        @JsonProperty("attributionHTML")
        public String getAttributionHTML() { return attributionHTML; }
        @JsonProperty("attributionHTML")
        public void setAttributionHTML(String value) { this.attributionHTML = value; }

        @JsonProperty("data")
        public DataDTO getData() { return data; }
        @JsonProperty("data")
        public void setData(DataDTO  value) { this.data = value; }

        @JsonProperty("etag")
        public String getEtag() { return etag; }
        @JsonProperty("etag")
        public void setEtag(String value) { this.etag = value; }


}
