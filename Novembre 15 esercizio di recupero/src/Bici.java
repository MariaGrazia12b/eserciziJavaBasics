public class Bici extends Veicolo {
    enum Tipo {
        TREKKING,
        PASSEGGIO,
        ELETTRICA
    }

    public Bici(String marca, String modello, String alimentazione, String colore, int posti,
                Boolean noleggiato, Tipo tipo, boolean marce, String telaio, double polliciRuote) {
        super(marca, modello, alimentazione, colore, posti, noleggiato);
        this.tipo = tipo;
        this.marce = marce;
        this.telaio = telaio;
        this.polliciRuote = polliciRuote;
    }

    private Tipo tipo;
    private boolean marce;
    private String telaio;
    private double polliciRuote;

}
