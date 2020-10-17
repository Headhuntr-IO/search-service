package io.headhuntr.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Data
@Document(indexName = "hh2_candidates")
public class Candidate {

    @Id
    String id;

    String firstName;
    String lastName;
    String fullName;
    Integer monthsExperience;
    List<ContactInformation> contactDetails;

    List<Job> jobHistory;
    List<Skill> skills;
    List<Industry> industries;

    @Data
    public static class ContactInformation {

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
