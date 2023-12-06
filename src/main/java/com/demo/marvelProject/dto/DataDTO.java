package com.demo.marvelProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DataDTO {
        private Integer offset;
        private Integer limit;
        private Integer total;
        private Integer count;
        private List<ResultDTO> results;

        @JsonProperty("offset")
        public Integer getOffset() { return offset; }
        @JsonProperty("offset")
        public void setOffset(Integer value) { this.offset = value; }

        @JsonProperty("limit")
        public Integer getLimit() { return limit; }
        @JsonProperty("limit")
        public void setLimit(Integer value) { this.limit = value; }

        @JsonProperty("total")
        public Integer getTotal() { return total; }
        @JsonProperty("total")
        public void setTotal(Integer value) { this.total = value; }

        @JsonProperty("count")
        public Integer getCount() { return count; }
        @JsonProperty("count")
        public void setCount(Integer value) { this.count = value; }

        @JsonProperty("results")
        public List<ResultDTO> getResults() { return results; }
        @JsonProperty("results")
        public void setResults(List<ResultDTO> value) { this.results = value; }

}
