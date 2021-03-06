package com.sailfish.monitor.dashboard;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@SpringBootApplication
@EnableEurekaClient
public class ApplicationAdminServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationAdminServer.class, args);
    }

}