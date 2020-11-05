package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Candidate;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@Tag(
        name = "Candidate Resource",
        description = "People that we want to hire"
)
@SecurityRequirement(name = "api")
@XRayEnabled
public interface CandidateRepository extends ElasticsearchRepository<Candidate, String> {
}
