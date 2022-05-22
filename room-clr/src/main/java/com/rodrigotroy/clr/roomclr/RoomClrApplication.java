package com.rodrigotroy.clr.roomclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class RoomClrApplication {
    private static final Logger LOG = LoggerFactory.getLogger(RoomClrApplication.class);

    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            LOG.info("Starting CLR app...");
            ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
                                                                     HttpMethod.GET,
                                                                     null,
                                                                     new ParameterizedTypeReference<>() {
                                                                     });

            for (Room room : Objects.requireNonNull(rooms.getBody())) {
                LOG.info(room.toString());
            }

            LOG.info("Finishing CLR app...");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomClrApplication.class,
                              args);
    }

}
