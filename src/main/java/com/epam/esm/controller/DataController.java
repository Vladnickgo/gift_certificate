package com.epam.esm.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DataController {
    @GetMapping("/")
    public String checkGet() {
        return "checkGet";
    }

    @PostMapping("/")
    public String checkPost(@RequestBody Optional<String> string) {
        if (string.isPresent()) {
            return "checkPost: " + string.get();
        }else {
            return "checkPost: with empty ID";
        }
    }

    @PutMapping("/")
    public String checkUpdate() {
        return "checkUpdate";
    }

    @DeleteMapping("/")
    public String checkDelete() {
        return "checkDelete";
    }
}
