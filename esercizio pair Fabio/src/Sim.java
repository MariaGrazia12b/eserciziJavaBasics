import java.math.BigDecimal;
import java.util.ArrayList;

//il numero di telefono, il credito disponibile, la lista delle telefonate effettuate e
//la durata di ogni telefonata.
public class Sim {
    private int numero;
    private BigDecimal credito;
    private ArrayList<Telefonata> chiamateEffettuate;
    private double durataChiamata;

    public Sim(int numero, BigDecimal credito, ArrayList<Telefonata> chiamateEffettuate, double durataChiamata) {
        this.numero = numero;
        this.credito = credito;
        this.chiamateEffettuate = chiamateEffettuate;
        this.durataChiamata = durataChiamata;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public ArrayList<Telefonata> getChiamateEffettuate() {
        return chiamateEffettuate;
    }

    public void setChiamateEffettuate(ArrayList<Telefonata> chiamateEffettuate) {
        this.chiamateEffettuate = chiamateEffettuate;
    }

    public double getDurataChiamata() {
        return durataChiamata;
    }

    public void setDurataChiamata(double durataChiamata) {
        this.durataChiamata = durataChiamata;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numero=" + numero +
                ", credito=" + credito +
                ", chiamateEffettuate=" + chiamateEffettuate +
                ", durataChiamata=" + durataChiamata +
                '}';
    }
    /*un metodo per inserire una telefonata con i relativi dati; OK
    un metodo per il calcolo dei minuti totali di conversazione;
    metodo per il calcolo delle telefonate effettuate verso un determinato numero;
    metodo per la stampa dei dati della SIM e l’elenco delle telefonate.*/

    public void aggiungiTelefonata (Telefonata t) {
        this.chiamateEffettuate.add(t);
    }
    public double minutiTotConversazione () {
        double minTot = 0;
        for (Telefonata t : this.chiamateEffettuate) {
            minTot = minTot + t.getDurata();
        }
        return minTot;
    }
    public int chiamateVersoUnNumero (int numero) {
        int chiamate = 0;
        for (Telefonata t : this.chiamateEffettuate) {
            if (t.getNumeroDestinatario() == numero) {
                chiamate ++;
            }
        }
        return chiamate;
    }
}
