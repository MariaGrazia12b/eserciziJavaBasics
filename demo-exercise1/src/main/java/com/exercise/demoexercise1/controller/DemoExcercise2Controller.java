package com.exercise.demoexercise1.controller;

import com.exercise.demoexercise1.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class DemoExcercise2Controller
{
    @GetMapping(path = "/ciao/Lombardia")
    public User ciao (@RequestParam String nome) {
        return new User(nome);
    }
}
