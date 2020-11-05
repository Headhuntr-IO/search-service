package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Industry;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@Tag(
        name = "Industry Resource",
        description = "The industrial classification of candidates"
)
@XRayEnabled
public interface IndustryRepository extends ElasticsearchRepository<Industry, String> {
}
