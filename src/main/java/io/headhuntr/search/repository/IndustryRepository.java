package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Industry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@XRayEnabled
public interface IndustryRepository extends ElasticsearchRepository<Industry, String> {
}
