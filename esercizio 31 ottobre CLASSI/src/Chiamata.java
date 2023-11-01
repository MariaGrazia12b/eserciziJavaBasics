
public class Chiamata {
    private int minutiChiamata;
    private double numeroDestinatarioChiamata;

    public Chiamata(int minutiChiamata, double numeroDestinatarioChiamata) {
        this.minutiChiamata = minutiChiamata;
        this.numeroDestinatarioChiamata = numeroDestinatarioChiamata;
    }

    public int getMinutiChiamata() {
        return minutiChiamata;
    }

    public void setMinutiChiamata(int minutiChiamata) {
        this.minutiChiamata = minutiChiamata;
    }

    public double getNumeroDestinatarioChiamata() {
        return numeroDestinatarioChiamata;
    }

    public void getNumeroDestinatarioChiamata(double numeroDestinatarioChiamata) {
        this.numeroDestinatarioChiamata = numeroDestinatarioChiamata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "minutiChiamata=" + minutiChiamata +
                ", numeroDestinatarioChiamata=" + numeroDestinatarioChiamata +
                '}';
    }
}
