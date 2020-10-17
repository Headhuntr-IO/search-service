package io.headhuntr.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "hh2_skills")
public class Skill {

    @Id
    String id;

    String classification; //skills, products, certification

    String name;

    String category;
    String subCategory;

    /**
     * potential match for this skill
     */
    Long candidateCount;
}
