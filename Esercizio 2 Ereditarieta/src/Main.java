// Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
// che stampi l'area della forma. Crea poi una sottoclasse chiamata Rettangolo che fa override
// del metodo calcolaArea() per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(28.5, 14.5);
        rettangolo.calcolaArea();

    }
}