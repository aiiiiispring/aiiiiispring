package com.myself.web;

import lombok.extern.slf4j.Slf4j;
import org.dromara.x.file.storage.spring.EnableFileStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aiiiiii
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFileStorage
@ComponentScan(basePackages = {"com.myself.*"})
@Slf4j
public class MyselfProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyselfProjectApplication.class, args);
    }

}
