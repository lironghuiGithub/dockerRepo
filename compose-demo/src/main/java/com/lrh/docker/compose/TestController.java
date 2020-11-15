package com.lrh.docker.compose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @version 1.0.0
 * @auther lironghui
 * @date 2020/11/1
 */
@RestController
public class TestController {
    @Autowired
    Environment environment;

    @GetMapping("/system/property/{key}")
    public Mono<String> getSystemProperties(@PathVariable String key) {
        return Mono.justOrEmpty(System.getProperty(key));
    }

    @GetMapping("/spring/property/{key}")
    public Mono<String> getSpringProperties(@PathVariable String key) {
        return Mono.justOrEmpty(environment.getProperty(key));
    }
}
