public class Veicolo {
    private String marca;
    private String modello;
    private String alimentazione;
    private String colore;
    private int posti;

    public Boolean getNoleggiato() {
        return noleggiato;
    }

    public void setNoleggiato(Boolean noleggiato) {
        this.noleggiato = noleggiato;
    }

    private Boolean noleggiato;

    public Veicolo(String marca, String modello, String alimentazione, String colore, int posti, Boolean noleggiato) {
        this.marca = marca;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.colore = colore;
        this.posti = posti;
        this.noleggiato = noleggiato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", alimentazione='" + alimentazione + '\'' +
                ", colore='" + colore + '\'' +
                ", posti=" + posti +
                '}';
    }
}
