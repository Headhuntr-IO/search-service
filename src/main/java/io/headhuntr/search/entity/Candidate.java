package io.headhuntr.search.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Getter
@Setter
@Document(indexName = "hh2_candidates")
public class Candidate {

    @Id
    String id;
    String firstName;
    String lastName;
    String fullName;
}
