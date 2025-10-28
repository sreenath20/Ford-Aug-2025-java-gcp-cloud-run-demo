package com.gcp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping
    public String info() {
        return "Hello from my VM";
    }
    @GetMapping("/about")
    public String about() {
        return "Cloud Run demo !";
    }
}
