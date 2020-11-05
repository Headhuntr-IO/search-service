package io.headhuntr.search.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Search API",
                description = "API for searching candidates and reference data"
        ),
        servers = {
                @Server(description = "Local", url = "http://localhost:8080"),
                @Server(description = "Prod", url = "https://api.prod.com")
        }
)
public class OpenAPIConfiguration {
}
