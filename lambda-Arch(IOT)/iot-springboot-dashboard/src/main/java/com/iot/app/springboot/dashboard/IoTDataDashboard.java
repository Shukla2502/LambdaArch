package com.iot.app.springboot.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring boot application class for Dashboard.
 *
 * @author abaghel
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.iot.app.springboot.dashboard"})
@EnableCassandraRepositories("com.iot.app.springboot.dao")
public class IoTDataDashboard {
    public static void main(String[] args) {
        SpringApplication.run(IoTDataDashboard.class, args);
    }
}

