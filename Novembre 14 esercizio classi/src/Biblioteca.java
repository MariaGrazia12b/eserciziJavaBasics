import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> elencoLibri = new ArrayList<>();

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public void setElencoLibri(ArrayList<Libro> elencoLibri) {
        this.elencoLibri = elencoLibri;
    }

    public ArrayList<Libro> aggiungiLibro(Libro lib){
        this.elencoLibri.add(lib);
        return this.elencoLibri;
    }

    public void stampaElencoLibri(){
        for(Libro i : this.elencoLibri){
            System.out.println(i);
        }
    }

    public void stampaLibriDisp(){
        for(Libro i : this.elencoLibri){
            if(i.getisSeDisponibile() == true){
                System.out.println(i);
            }
        }
    }

    public Libro getByID (int id){
        for(Libro book :this.elencoLibri){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Libro> serchBooksByDate (OffsetDateTime start, OffsetDateTime end, ArrayList<Prestito> prestiti){
        ArrayList<Libro> libriCompresi = new ArrayList<>();
        for(Prestito p : prestiti){
            if(p.getDataPrestito().isAfter(start) && p.getDataPrestito().isBefore(end)){
                libriCompresi.add(getByID(p.getId()));
            }
        }
        return libriCompresi;
    }



    @Override
    public String toString() {
        return "Biblioteca{" +
                "elencoLibri=" + elencoLibri +
                '}';
    }
}
