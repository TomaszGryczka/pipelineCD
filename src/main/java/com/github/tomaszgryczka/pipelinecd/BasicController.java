package com.github.tomaszgryczka.pipelinecd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${app.version}")
    private String appVersion;

    @RequestMapping("/")
    String sayHello() {
        return "Hello World! App version: " + appVersion;
    }
}
