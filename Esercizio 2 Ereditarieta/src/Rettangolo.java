public class Rettangolo extends Forma {
   //attributi di Rettangolo
    private double base;
    private double altezza;

    //costruttore(promemoria per me: che ha per forza il nome della classe ovvio)
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //ho generato i metodi getter e setter perchè così in futuro posso accedere o settare i valori degli attributi
    //volendo.
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
