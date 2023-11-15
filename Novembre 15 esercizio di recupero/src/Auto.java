public class Auto extends Veicolo{
    enum Segmento {
        CITYCAR,
        UTILITARIA,
        SW,
        SPORTIVA,
        SUV

    }
    private int cilindrata;
    private String targa;
    private int porte;
    private Segmento segmento;

    public Auto(String marca, String modello, String alimentazione, String colore, int posti,
                Boolean noleggiato, int cilindrata, String targa, int porte, Segmento segmento) {
        super(marca, modello, alimentazione, colore, posti, noleggiato);
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.porte = porte;
        this.segmento = segmento;
    }
}
