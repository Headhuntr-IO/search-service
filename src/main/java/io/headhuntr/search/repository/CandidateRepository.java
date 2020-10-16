package io.headhuntr.search.repository;

import io.headhuntr.search.entity.Candidate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CandidateRepository extends ElasticsearchRepository<Candidate, String> {
}
