package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Company;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@XRayEnabled
public interface CompanyRepository extends ElasticsearchRepository<Company, String> {
}
