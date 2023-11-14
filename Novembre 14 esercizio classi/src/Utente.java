import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private ArrayList<Libro> libPrestito = new ArrayList<>();


    public Utente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public ArrayList<Libro> getLibPrestito() {
        return libPrestito;
    }

    public void setLibPrestito(ArrayList<Libro> libPrestito) {
        this.libPrestito = libPrestito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", libPrestito=" + libPrestito +
                '}';
    }

    public Prestito prestaLibro(ArrayList<Libro> b1)  {
        System.out.println(b1);
        Scanner in = new Scanner(System.in);
        System.out.println("Quale dispositivo vuoi in prestito? Fornisci id");
        Integer a = in.nextInt();

        Libro l = checkDispoLib(a,b1);
        if (l != null) {
            l.setSeDisponibile(false);
            Prestito p1 = new Prestito(this.email, l.getId(), OffsetDateTime.now(), null);
            return p1;
        }else {
            return null;
        }
    }

    public Libro checkDispoLib(Integer a, ArrayList<Libro> b1){
        Libro l = null;
        if(a != null){
            for(Libro i : b1) {
                if (i.getId() == a) {
                    if(i.getisSeDisponibile()){
                        l = i;
                    }
                }
            }
            return l;
        }else{
            return null;
        }
    }


    public ArrayList<Libro> restLibro(Biblioteca b1){
        Scanner in = new Scanner(System.in);
        System.out.println("Quale libro vuoi restituire? Indicare id");
        System.out.println(this.getLibPrestito());
        Integer a = in.nextInt();
        Libro l = checkDispoLibRest(a,b1);

        return this.getLibPrestito();
    }

    public Libro checkDispoLibRest(Integer a, Biblioteca b1){
        Libro l = null;
        if(a != null){
            for(Libro i : b1.getElencoLibri()) {
                if (i.getId() == a && i.getisSeDisponibile() == false) {
                    i.setSeDisponibile(true);
                    l = i;
                }
            }
            return l;
        }else{
            return null;
        }
    }







}
