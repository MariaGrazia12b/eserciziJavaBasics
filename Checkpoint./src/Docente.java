//Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente:
// nome, cognome, codice ed età. La classe dovrà avere un costruttore ed i metodi accessori.
//Scrivere poi una classe Università che rappresenti un insieme di docenti universitari tramite un Array
// di tipo Docente e che contenga il costruttore, i metodi accessori ed un metodo che restituisce
// l’età minima tra i docenti universitari.


public class Docente {
    private String nome;
    private String cognome;
    private int codice;
    private int età;

    public Docente(String nome) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.età = età;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
}
