package com.grigoryevdev.test.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ParserService {

    private final Logger log = LoggerFactory.getLogger(ParserService.class);

    public void parseLogFileAndSaveInDb(String filePath) {
        try{
            log.debug("Start parsing log file located by path: {} ", filePath);
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                String[] line = readLine.split("|");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
