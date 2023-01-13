package io.github.fairyspace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: video
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/1/13
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world ~");
    }
}
