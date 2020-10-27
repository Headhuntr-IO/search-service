package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Candidate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@XRayEnabled
public interface CandidateRepository extends ElasticsearchRepository<Candidate, String> {
}
