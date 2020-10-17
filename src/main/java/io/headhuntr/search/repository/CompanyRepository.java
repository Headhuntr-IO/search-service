package io.headhuntr.search.repository;

import io.headhuntr.search.entity.Company;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CompanyRepository extends ElasticsearchRepository<Company, String> {
}
