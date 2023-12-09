import java.time.OffsetDateTime;
import java.util.ArrayList;

//Creare una classe Evento che ha come attributi: id, titolo, descrizione, luogo, data inizio,
//data fine, partecipanti.
public class Evento {
    private int id;
    private String titolo, descrizione, luogo;
    private OffsetDateTime dataInizio, dataFine;
    private int partecipanti;
    private boolean disponibilita;

    public Evento(int id, String titolo, String descrizione, String luogo,
                  OffsetDateTime dataInizio, OffsetDateTime dataFine, int partecipanti, boolean disponibilita) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.luogo = luogo;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.partecipanti = partecipanti;
        this.disponibilita = disponibilita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public OffsetDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(OffsetDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public OffsetDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(OffsetDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public int getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(int partecipanti) {
        this.partecipanti = partecipanti;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", luogo='" + luogo + '\'' +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", partecipanti=" + partecipanti +
                ", disponibilita=" + disponibilita +
                '}';
    }
}
