package com.ps.labs.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:config.properties", ignoreResourceNotFound = true)
public class ConfigProperties {

    @Value("${code.client}")
    private String codeClient;

    @Value("${code.app:MyApp}")
    private String codeApp;

    @Value("${app.nb.threads:5}")
    private int nbThreads;

    @Value("${app.random.value:#{null}}")
    private String randomValue;

    public String getCodeClient() {
        return codeClient;
    }

    public String getCodeApp() {
        return codeApp;
    }

    public int getNbThreads() {
        return nbThreads;
    }

    public String getRandomValue() {
        return randomValue;
    }

}
