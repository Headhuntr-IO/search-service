package io.headhuntr.search.config;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import com.amazonaws.xray.strategy.FixedSegmentNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class AWSXrayConfiguration {

    @Bean
    public Filter TracingFilter() {
        return new AWSXRayServletFilter(new FixedSegmentNamingStrategy("search-service:0.0.2"));
    }

}
