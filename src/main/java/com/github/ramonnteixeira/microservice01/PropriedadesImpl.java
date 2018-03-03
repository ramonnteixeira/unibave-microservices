package com.github.ramonnteixeira.microservice01;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropriedadesImpl {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Value("${app.config.long1}")
    private Long longValue;

    @Value("${app.config.boolean1}")
    private Boolean booleanValue;

    @Value("${app.config.double1}")
    private Double doubleValue;

    @Autowired
    private Environment env;

    @Autowired
    private ConstantesVariaveis envs;
    
    @PostConstruct
    public void init() {
        logger.info("app.config.long = {}", longValue);
        logger.info("app.config.boolean = {}", booleanValue);
        logger.info("app.config.double = {}", doubleValue);
        logger.info("app.config.string = {}", env.getProperty("app.config.string1"));

        logger.info("app.config.long = {}", envs.getLong1());
        logger.info("app.config.boolean = {}", envs.getBoolean1());
        logger.info("app.config.double = {}", envs.getDouble1());
        logger.info("app.config.string = {}", envs.getString1());
    }
    
}
