package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Skill;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(
        name = "Skill Resource",
        description = "Skills, Abilities, and Certifications"
)
@SecurityRequirement(name = "api")
@XRayEnabled
public interface SkillRepository extends BasicSearchRepository<Skill> {
}
