package com.exercise.demoexercise1.controller;

import com.exercise.demoexercise1.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class DemoExercise1Controller {
    @GetMapping(path = "/ciao1")
    public String tempoLombardia (@RequestParam String nome, @PathVariable String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }


}
