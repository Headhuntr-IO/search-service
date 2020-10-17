package io.headhuntr.search.config;

import io.headhuntr.search.entity.Candidate;
import io.headhuntr.search.entity.Company;
import io.headhuntr.search.entity.Industry;
import io.headhuntr.search.entity.Skill;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Candidate.class, Skill.class, Company.class, Industry.class, Candidate.Skill.class, Candidate.Industry.class);
    }
}
