package com.exercise.demoexercise1;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome) {
        this.nome = nome;
        this.provincia = "Lombardia";
        this.saluto = "Ciao " + nome + ",  com'e' il tempo in "+ provincia + "?";
    }
}
