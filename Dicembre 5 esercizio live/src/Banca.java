import java.math.BigDecimal;
import java.util.ArrayList;
//una classe Banca con attributi come nomeBanca (String), un array di ContoBancario e un intero numConti
//(per tenere traccia del numero attuale di conti).
//Crea un costruttore che accetti il nome della banca e il numero massimo di conti che la banca può gestire.
//Implementa un metodo aggiungiConto che aggiunga un conto alla lista dei conti se non si supera
// il numero massimo di conti.
//Crea un metodo visualizzaInformazioniConti che stampi le informazioni (ad esempio, IBAN e saldo) di tutti i conti presenti nella banca.
//Implementa un metodo saldoTotale che restituisca il saldo totale di tutti i conti presenti nella banca.
public class Banca {
    private String nomeBanca;
    private ArrayList<ContoBancario> listaConti;
    private int numConti;

    public Banca(String nomeBanca, ArrayList<ContoBancario> listaConti, int numConti) {
        this.nomeBanca = nomeBanca;
        this.listaConti = listaConti;
        this.numConti = numConti;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public ArrayList<ContoBancario> getListaConti() {
        return listaConti;
    }

    public void setListaConti(ArrayList<ContoBancario> listaConti) {
        this.listaConti = listaConti;
    }

    public int getNumConti() {
        return numConti;
    }

    public void setNumConti(int numConti) {
        this.numConti = numConti;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", listaConti=" + listaConti +
                ", numConti=" + numConti +
                '}';
    }

    public void aggiungiConto (ContoBancario conto, int numMax) {
        if (this.numConti < numMax) {
            this.listaConti.add(conto);
        }
    }
    public void visualizzaInfoConti () {
        for (ContoBancario c : this.listaConti) {
            System.out.println(c.getIban() + " " + c.getSaldo());
        }
    }
    public BigDecimal saldoTotale () {
        BigDecimal totale = BigDecimal.ZERO;
        for (ContoBancario c : this.listaConti) {
            totale = totale.add(c.getSaldo());
        }
        return totale;
    }
}
