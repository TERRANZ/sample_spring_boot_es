package ru.terra.sample.esboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAutoConfiguration
@Component
@ComponentScan
public class Main {
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }
}
