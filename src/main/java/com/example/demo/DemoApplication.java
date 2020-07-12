package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        readAllLines();
    }

    public static void readAllLines() {
        try {
//            String file1 = "C:\\Users\\kvincent\\Desktop\\fincredit\\10thJuly\\servlet\\servlet\\FromAPI\\2020-07-10\\20-07-10-539420.log";
//            String file = "C:\\Users\\kvincent\\Desktop\\fincredit\\10thJuly\\mdb\\Application\\2020-07-10\\20-07-10-549145.log";
            String file2 = "C:\\Users\\kvincent\\Desktop\\fincredit\\10thJuly\\servlet\\servlet\\ToAPI\\2020-07-10\\20-07-10-551864.log";
            List<String> allLines = Files.readAllLines(Paths.get(file2));
            for (String line : allLines) {
                if (line.contains("716541631") && !line.contains("LOGIN")) {
                    System.out.println(line);
//                    System.out.println(line.substring(line.indexOf("<field68>") + 1, line.indexOf("</field68>")));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
