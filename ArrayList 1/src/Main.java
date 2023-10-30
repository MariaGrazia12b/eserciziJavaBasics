//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> listaStudenti = new ArrayList<Student>();
        listaStudenti.add(new Student("Ettore", 18));
        listaStudenti.add(new Student("Andromaca", 17));
        listaStudenti.add(new Student("Paolo", 18));
        listaStudenti.add(new Student("Francesca", 15));
        System.out.println("Lista studenti iniziale: ");
        for (Student student : listaStudenti) {
            System.out.println("Nome: " + student.getName() + " età: " + student.getAge());
        }

        listaStudenti.add(new Student("Romeo", 10));
        listaStudenti.add(new Student("Giulietta", 12));
        listaStudenti.add(new Student("Dante", 16));
        listaStudenti.add(new Student("Beatrice", 14));
        System.out.println("Lista studenti aggiornata:");
        for (Student student : listaStudenti) {
            System.out.println("Nome: " + student.getName() + " età: " + student.getAge());
        }
    }
}