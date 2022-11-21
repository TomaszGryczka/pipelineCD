package com.github.tomaszgryczka.pipelinecd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello world";
    }
}
