package com.luv2code.springboot.demo.mycoolap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FunRestController {

    private List<String> strings = new ArrayList<String>();

    public FunRestController() {
        this.strings.add("William");
        this.strings.add("Franni");
    }

    @GetMapping("/")
    public List<String> getAllList() {
        return this.strings;
    }

}
