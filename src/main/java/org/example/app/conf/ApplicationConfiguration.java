package org.example.app.conf;

import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:configuration.properties", ignoreResourceNotFound = false)
})
public class ApplicationConfiguration {

}
