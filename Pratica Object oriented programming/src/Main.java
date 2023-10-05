
public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo();
        article1.nome = "Pizza Margherita";
        article1.prezzo = 3.99;
// la classe è sempre articolo però abbiamo due istanze che sono diverse tra di loro.
        Articolo article2 = new Articolo();
        article2.nome = "Coca cola";
        article2.prezzo = 0.99;

        //abbiamo cercato di stampare una istanza di un oggetto. lui ha stampato un numero che si usa per
        // l'identità dell'istanza che lui ha calcolato in base ai contenuti della classe. può essere utile per
        //capire se sono due classi diverse.
        System.out.println("Articolo 1: " + article1);
        System.out.println("Articolo 2: " + article2);

        //per stampare sul serio c'è un metodo che si chiama toString.

        Carrello carrello = new Carrello();
        carrello.articoli = new Articolo []{article1, article2};
        carrello.prezzoFinale = article1.prezzo + article2.prezzo;
        //sempre generate + toString e stampiamo.
        System.out.println("Carrello: " + carrello);

    }
}