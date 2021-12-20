package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@RestController
public class TestController {

    @Value("${app.env}")
    private String envType;

    @GetMapping("test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("config")
    public String getConfig() {
        return "ENV_TYPE:" + envType;
    }

    @GetMapping("write")
    public String write() throws IOException {
        Path writePath = Paths.get("/home/hello.txt");
        Files.deleteIfExists(writePath);
        Files.createFile(writePath);
        Files.write(writePath, "Hello World".getBytes(StandardCharsets.UTF_8), StandardOpenOption.TRUNCATE_EXISTING);
        return "Done";
    }
}
