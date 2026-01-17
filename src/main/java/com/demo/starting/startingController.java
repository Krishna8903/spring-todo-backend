package com.demo.starting;

import org.springframework.web.bind.annotation.*;

@RestController

class StartingController {
    // POST endpoint that accepts JSON input
    @GetMapping("/hello")
    public String say() {
        return "Hello! This Works";
    }

    // Regular method (not mapped to any endpoint yet)
    public String func() {

        return "This changed";
    }
}