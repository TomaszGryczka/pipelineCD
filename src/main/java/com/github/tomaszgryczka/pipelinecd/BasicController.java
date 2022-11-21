package com.github.tomaszgryczka.pipelinecd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @RequestMapping("/")
    String sayHello() {
        return "Hello World!";
    }
}
