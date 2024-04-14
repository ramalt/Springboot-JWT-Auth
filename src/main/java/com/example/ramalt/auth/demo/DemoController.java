package com.example.ramalt.auth.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("im ok.");
    }
}
