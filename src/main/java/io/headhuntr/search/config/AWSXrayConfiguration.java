package io.headhuntr.search.config;

import com.amazonaws.xray.entities.Subsegment;
import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import com.amazonaws.xray.spring.aop.AbstractXRayInterceptor;
import com.amazonaws.xray.strategy.FixedSegmentNamingStrategy;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import java.util.Map;

@Configuration
public class AWSXrayConfiguration {

    @Bean
    public Filter TracingFilter() {
        return new AWSXRayServletFilter(new FixedSegmentNamingStrategy("search-service:0.0.2"));
    }

    @Aspect
    @Component
    public static class XRayInspector extends AbstractXRayInterceptor {

        @Override
        protected Map<String, Map<String, Object>> generateMetadata(ProceedingJoinPoint proceedingJoinPoint, Subsegment subsegment) {
            return super.generateMetadata(proceedingJoinPoint, subsegment);
        }

        @Override
        @Pointcut("@within(com.amazonaws.xray.spring.aop.XRayEnabled) && bean(*Controller)")
        public void xrayEnabledClasses() {}

    }
}
