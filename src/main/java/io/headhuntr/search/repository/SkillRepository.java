package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Skill;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@XRayEnabled
public interface SkillRepository extends ElasticsearchRepository<Skill, String> {
}
