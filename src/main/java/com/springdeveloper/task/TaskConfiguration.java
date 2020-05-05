package com.springdeveloper.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableTask
public class TaskConfiguration {
	private final Logger logger = LoggerFactory.getLogger(TaskConfiguration.class);

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            logger.info("***********************");
            logger.info(dateFormat.format(new Date()));
            logger.info("***********************");
        };
    }
}