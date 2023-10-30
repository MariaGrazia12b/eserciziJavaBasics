//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student("Ettore", 18));
        listaStudenti.add(new Student("Andromaca", 17));
        listaStudenti.add(new Student("Paolo", 18));
        listaStudenti.add(new Student("Francesca", 15));
        listaStudenti.add(new Student("Romeo", 10));
        listaStudenti.add(new Student("Giulietta", 12));
        listaStudenti.add(new Student("Dante", 16));
        listaStudenti.add(new Student("Beatrice", 14));
        listaStudenti.add(new Student("Ulisse", 15));
        listaStudenti.add(new Student("Penelope", 14));
        listaStudenti.add(new Student("Adamo", 13));
        listaStudenti.add(new Student("Eva", 12));
        System.out.println("Lista studenti iniziale: ");
        for (Student student : listaStudenti) {
            System.out.println("Nome: " + student.getName() + " età: " + student.getAge());
        }

        listaStudenti.sort(Comparator.comparing(Student :: getName));
        System.out.println("Lista ordinata:");
        for (Student student : listaStudenti) {
            System.out.println("Nome: " + student.getName() + " età: " + student.getAge());
        }
    }
}