public class Barca extends Veicolo {
    public Barca(String marca, String modello, String alimentazione, String colore, int posti,
                 Boolean noleggiato, int CV, String tipoMotore, int piedi, String gps) {
        super(marca, modello, alimentazione, colore, posti, noleggiato);
        this.CV = CV;
        this.tipoMotore = tipoMotore;
        this.piedi = piedi;
        this.gps = gps;
    }

    private int CV;
    private String tipoMotore;
    private int piedi;
    private String gps;
}
