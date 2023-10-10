// A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area aggiungere
// una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura.

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(28.5, 14.5);
        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo(22.4, 30.6);
        triangolo.calcolaArea();

    }
}