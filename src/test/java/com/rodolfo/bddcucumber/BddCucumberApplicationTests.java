package com.rodolfo.bddcucumber;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = BddCucumberApplication.class)
public class BddCucumberApplicationTests {

    @LocalServerPort
    private int port;

    @PostConstruct
    public void setup() {
        System.setProperty("port", String.valueOf(port));
    }

}