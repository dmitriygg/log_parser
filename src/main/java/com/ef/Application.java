package com.ef;

import com.ef.service.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    ParserService parserService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {

        String pathToFile = args[0];
        String startDate = args[1];
        String duration = args[2];
        String threshold = args[3];


        parserService.parseLogFileAndSaveInDb(pathToFile);


    }
}
