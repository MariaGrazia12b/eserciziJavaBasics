package com.exercise.demoexercise1;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ",  com'e' il tempo in "+ provincia + "?";
    }
}
