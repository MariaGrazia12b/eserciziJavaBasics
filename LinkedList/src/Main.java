//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Fruit> listaFrutta = new LinkedList<>();
        listaFrutta.add(new Fruit("Pesca"));
        listaFrutta.add(new Fruit("Melone"));
        listaFrutta.add(new Fruit("Cocco"));
        listaFrutta.add(new Fruit("Fragola"));
        listaFrutta.add(new Fruit("Mora"));
        System.out.println("Lista Frutta: ");
        for (Fruit frutto : listaFrutta) {
            System.out.println(frutto.getName());
        }

        listaFrutta.addFirst(new Fruit("Melograno"));
        listaFrutta.addLast(new Fruit("Uva"));
        System.out.println("Lista Frutta aggiornata: ");
        for (Fruit frutto : listaFrutta) {
            System.out.println(frutto.getName());
        }
    }
}