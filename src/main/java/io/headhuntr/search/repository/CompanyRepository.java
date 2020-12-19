package io.headhuntr.search.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import io.headhuntr.search.entity.Company;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(
        name = "Company Resource",
        description = "Companies that our candidates worked at"
)
@SecurityRequirement(name = "api")
@XRayEnabled
public interface CompanyRepository extends BasicSearchRepository<Company> {
}
