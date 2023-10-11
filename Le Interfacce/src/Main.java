//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo
// per il calcolo dell'area.

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(19.8, 9.5);
        System.out.println("L'area del rettangolo è: " + rettangolo.calcoloArea());

        Triangolo triangolo = new Triangolo(12.4, 20.0);
        System.out.println("L'area del triangolo è: " + triangolo.calcoloArea());

    }
}