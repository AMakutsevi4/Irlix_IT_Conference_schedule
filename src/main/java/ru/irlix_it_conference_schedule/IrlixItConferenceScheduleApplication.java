package ru.irlix_it_conference_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IrlixItConferenceScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(IrlixItConferenceScheduleApplication.class, args);
        System.out.println("http://localhost:8080/swagger-ui/index.html#/");
    }

}
