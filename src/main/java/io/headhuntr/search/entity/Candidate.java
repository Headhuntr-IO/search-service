package io.headhuntr.search.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Schema(
        name = "Candidate",
        description = "Cool people that we need to hire"
)
@Data
@Document(indexName = "hh2_candidates")
public class Candidate {

    @Id
    @Schema(
            description = "The unique identifier of a candidate",
            example = "100000",
            required = true
    )
    String id;

    @Schema(
            description = "Given name of the candidate",
            example = "John",
            required = true
    )
    String firstName;

    @Schema(
            description = "Family name of the candidate",
            example = "Doe",
            required = true
    )
    String lastName;

    @Schema(
            description = "The complete name of the candidate",
            example = "John Doe",
            required = true
    )
    String fullName;

    @Schema(
            description = "The total work experience expressed in months to simplify things",
            example = "18",
            required = true
    )
    Integer monthsExperience;

    List<ContactInformation> contactDetails;

    List<Job> jobHistory;
    List<Skill> skills;
    List<Industry> industries;

    @Data
    public static class ContactInformation {

        @Schema(
                description = "The order of the contact information, lower sequence should be shown first",
                example = "1",
                required = true
        )
        Integer sequence;

        /**
         * email, phone, etc
         */
        String type;

        String value;

    }

    /**
     * tagged companies
     */
    @Data
    public static class Job {

        Integer sequence;
        String companyId;
        String companyName;
        String title;
        String description;
        String start;
        String end;
        String location;
        Integer monthsExperience;

    }

    /**
     * tagged skills
     */
    @Data
    public static class Skill {

        /**
         * reference to the Skill entity
         */
        String id;
        Integer monthsExperience;
        Integer sequence;

        String classification; //skills, products, certification
        String name;
        String category;

    }

    /**
     * tagged industry
     */
    @Data
    public static class Industry {

        /**
         * reference to the Industry
         */
        String id;

        Integer sequence;
        Boolean current;
        Integer monthsExperience;

        String parent;
        String name;

        String start;
        String end;

    }
}
