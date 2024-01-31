package com.exercise.demoexercise1.controller;

import com.exercise.demoexercise1.User;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class DemoExcercise2Controller
{
    @GetMapping(path = "/ciao")
    public User ciao (@RequestParam String nome, @PathVariable String provincia) {
        return new User(nome, provincia);
    }
}
