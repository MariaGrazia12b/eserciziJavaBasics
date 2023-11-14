/*Immaginiamo di dover modellare le classi Java per rappresentare i libri,
gli autori e i clienti di una biblioteca.
abbiamo le classi Autore, Libro, e Cliente che rappresentano gli autori,
i libri e i clienti della biblioteca.
La classe principale Biblioteca crea istanze di queste classi
e ha dei metodi per la ricerca dei libri in prestito dei libri disponibili.*/
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        Libro lib1 = new Libro(1,"1984", "George Orwell", 1949, true);
        Libro lib2 = new Libro(2,"Promessi Sposi", "Manzoni", 1819, true);
        Libro lib3 = new Libro(3,"Il Signore degli Anelli", "J.R.R. Tolkien", 1954, true);
        Libro lib4 = new Libro(4,"To Kill a Mockingbird", "Harper Lee", 1960, true);

        bib.aggiungiLibro(lib1);
        bib.aggiungiLibro(lib2);
        bib.aggiungiLibro(lib3);
        bib.aggiungiLibro(lib4);

        System.out.println(bib.getElencoLibri());

        Utente u1 = new Utente("Bruno", "Figlio di troia", "testadicazzo@gmail.com");
        Utente u2 = new Utente("Ciccio", "Bianchi", "123@adb.com");


        ArrayList<Prestito> listPres = new ArrayList<>();
        listPres.add(u1.prestaLibro(bib.getElencoLibri()));

        System.out.println(listPres);

        bib.stampaLibriDisp();

        System.out.println(bib.serchBooksByDate(OffsetDateTime.now().minusDays(7), OffsetDateTime.now().plusDays(2),listPres));

    }
}
