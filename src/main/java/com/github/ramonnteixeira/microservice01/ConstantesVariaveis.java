package com.github.ramonnteixeira.microservice01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.config")
public class ConstantesVariaveis {
    
    private String string1;
    private Long long1;
    private Boolean boolean1;
    private Double double1;

    public String getString1() {
        return string1;
    }

    public Long getLong1() {
        return long1;
    }

    public Boolean getBoolean1() {
        return boolean1;
    }

    public Double getDouble1() {
        return double1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public void setLong1(Long long1) {
        this.long1 = long1;
    }

    public void setBoolean1(Boolean boolean1) {
        this.boolean1 = boolean1;
    }

    public void setDouble1(Double double1) {
        this.double1 = double1;
    }
    
}
