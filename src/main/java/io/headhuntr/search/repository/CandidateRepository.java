package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Candidate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

@Tag(
        name = "Candidate Resource",
        description = "People that we want to hire"
)
@SecurityRequirement(name = "api")
@XRayEnabled
public interface CandidateRepository extends ElasticsearchRepository<Candidate, String> {

    @Operation(
            operationId = "Candidate.findAllByFirstNameOrLastName",
            description = "Search for candidates that partially match with the first or last name",
            tags = { "candidate" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Found results"
            )
    })
    Page<Candidate> findAllByFirstNameOrLastName(@Param("name") String name, Pageable page);
}
