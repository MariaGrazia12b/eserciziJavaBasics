import java.math.BigDecimal;
import java.util.ArrayList;

public class Sim {
    private int numeroTelefono;
    private BigDecimal creditoDisponibile;
    private String intestatario;
    private PianoTariffario pianoTariffario;
    private ArrayList<Telefonata> listaTelefonate;

    public Sim(int numeroTelefono, BigDecimal creditoDisponibile, String intestatario,
               PianoTariffario pianoTariffario, ArrayList<Telefonata> listaTelefonate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = creditoDisponibile;
        this.intestatario = intestatario;
        this.pianoTariffario = pianoTariffario;
        this.listaTelefonate = listaTelefonate;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public BigDecimal getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(BigDecimal creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public PianoTariffario getPianoTariffario() {
        return pianoTariffario;
    }

    public void setPianoTariffario(PianoTariffario pianoTariffario) {
        this.pianoTariffario = pianoTariffario;
    }

    public ArrayList<Telefonata> getListaTelefonate() {
        return listaTelefonate;
    }

    public void setListaTelefonate(ArrayList<Telefonata> listaTelefonate) {
        this.listaTelefonate = listaTelefonate;
    }

    //un metodo per inserire una telefonata con i relativi dati;
    public void aggiungiTelefonata (Telefonata telefonata) {
        this.listaTelefonate.add(telefonata);
    }

    //un metodo per il calcolo dei minuti totali di conversazione;
    public double contaMinuti () {
        double durataTotale = 0;
        for(Telefonata telefonata : listaTelefonate) {
            durataTotale = durataTotale + telefonata.getDurata();
        }
        return durataTotale;
    }
    //metodo per il calcolo delle telefonate effettuate verso un determinato numero;
    public int contaTelefonate(int destinatario) {
        int telefonata = 0;
        for (Telefonata t : listaTelefonate) {
            if(t.getNumeroDestinatario() == destinatario) {
                telefonata++;
            }
        }
        return telefonata;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroTelefono=" + numeroTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                ", intestatario='" + intestatario + '\'' +
                ", pianoTariffario=" + pianoTariffario +
                ", listaTelefonate=" + listaTelefonate +
                '}';
    }
}
