package io.headhuntr.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "hh2_companies")
public class Company {

    @Id
    String id;

    String name;

    /**
     * the number of potential candidate match for this company
     */
    Long candidateCount;
}
