package io.headhuntr.search.repository;

import io.headhuntr.search.entity.Skill;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SkillRepository extends ElasticsearchRepository<Skill, String> {
}
