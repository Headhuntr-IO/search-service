package io.headhuntr.search.repository;

import io.headhuntr.search.entity.Industry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IndustryRepository extends ElasticsearchRepository<Industry, String> {
}
