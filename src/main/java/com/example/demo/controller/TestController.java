package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/abcd")
    public String getMapping() {
        return "@GetMapping";
    }

    @PostMapping("/abcd")
    public String postMapping() {
        return "@PostMapping";
    }

    @PutMapping("/abcd")
    public String putMapping() {
        return "@PutMapping";
    }

    @DeleteMapping("/abcd")
    public String deleteMapping() {
        return "@DeleteMapping";
    }

    @PatchMapping("/abcd")
    public String patchMapping() {
        return "@PatchMapping";
    }

    @GetMapping(value = "/value")
    public String getMappingWithValue() {
        return "@GetMapping(value = \"/abcd/value\")";
    }

    @GetMapping({"/bracket"})
    public String getMappingWithBracket() {
        return "@GetMapping({ \"/bracket\" })";
    }

    @GetMapping(value={"/multiple", "/multiple/"})
    public String getMappingWithArrayValue() {
        return "@GetMapping(value={\"/multiple\", \"/multiple/\"})";
    }

    @GetMapping({"/urltemplate/{id}"})
    public String getURLTemplate(@PathVariable Long id) {
        return "@GetMapping({\"/abcd/{id}\"}); id=" + id;
    }

    @GetMapping("/ant/{name:[a-z]+}")
    public String getAntPathVariable(@PathVariable String name) {
        return "@GetMapping(\"/ant/{name:[a-z]+}\"); name=" + name;
    }

    @GetMapping("/regex/{number:^[0-9]+$}")
    public String getRegexPathVariable(@PathVariable String number) {
        return "@GetMapping(\"/regex/{number:^[0-9]+$}\"); number=" + number;
    }

}