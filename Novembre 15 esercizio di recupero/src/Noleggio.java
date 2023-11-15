import java.util.ArrayList;
import java.util.Scanner;

public class Noleggio {
    private Veicolo veicolo;
    private Utente utente;
    private String pratica;

    public Noleggio(Veicolo veicolo, Utente utente, String pratica) {
        this.veicolo = veicolo;
        this.utente = utente;
        this.pratica = pratica;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String getPratica() {
        return pratica;
    }

    public void setPratica(String pratica) {
        this.pratica = pratica;
    }

}
