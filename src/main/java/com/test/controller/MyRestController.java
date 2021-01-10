package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dhriti Ghosh
 */
@RestController
@RequestMapping("/com/test")
public class MyRestController {
    @GetMapping("/{name}")
    public String sayMyName(@PathVariable String name) {
        return "Hello " + name;
    }
}
