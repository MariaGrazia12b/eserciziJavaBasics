public class Studente {
    private String nome;
    private String cognome;
    private double identificativo;


    //creiamo un metodo con lo stesso nome della classe.
    //il this è accessore all'istanza = diciamo al membro dell'istanza di assegnargli il valore dell'argomento.
    //ci serve xkè in questo caso hanno lo stesso nome, altrimenti non serviva (es. name = nome).

   //costruttore
    public Studente(String nome, String cognome, double identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }
    // getter
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public double getIdentificativo() {
        return identificativo;
    }

}
