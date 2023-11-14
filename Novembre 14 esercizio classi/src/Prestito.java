import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Prestito {
    private String email;
    private int id;

    private OffsetDateTime dataPrestito;

    private OffsetDateTime dataRestituzione;

    public Prestito(String email, int id, OffsetDateTime dataPrestito, OffsetDateTime dataRestituzione) {
        this.email = email;
        this.id = id;
        this.dataPrestito = dataPrestito;
        this.dataRestituzione = dataRestituzione;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffsetDateTime getDataPrestito() {
        return dataPrestito;
    }

    public void setDataPrestito(OffsetDateTime dataPrestito) {
        this.dataPrestito = dataPrestito;
    }

    public OffsetDateTime getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(OffsetDateTime dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }


    @Override
    public String toString() {
        return "Prestito{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", dataPrestito=" + dataPrestito +
                ", dataRestituzione=" + dataRestituzione +
                '}';
    }
}
