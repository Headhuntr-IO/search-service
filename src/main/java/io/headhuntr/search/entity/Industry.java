package io.headhuntr.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "hh2_industries")
public class Industry {

    @Id
    String id;

    String parent;
    String name;

    /**
     * the number of potential candidate match for this industry
     */
    Long candidateCount;
}
