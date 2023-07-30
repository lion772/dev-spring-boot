package com.luv2code.springboot.demo.mycoolap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FunRestController {

    @Value("${person.name}")
    private String personName;

    @Value("${team.name}")
    private String teamName;

    private List<String> strings = new ArrayList<String>();

    public FunRestController() {
        this.strings.add("William");
        this.strings.add("Franni");
    }

    @GetMapping("/teaminfo")
    public String getTeamName() { return teamName; }

    @GetMapping("/")
    public List<String> getAllList() {
        return this.strings;
    }

    @PostMapping("/")
    public void addNewString(@Valid @NonNull @RequestBody Optional<String> payload) {
        this.strings.add(payload.get());
    }

}
