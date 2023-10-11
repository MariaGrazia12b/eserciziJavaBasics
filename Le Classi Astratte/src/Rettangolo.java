class Rettangolo extends Forma {
    //attributi
    private double base;
    private double altezza;

    //costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    //implementazione metodo calcolaArea


    @Override
    double calcolaArea() {
        return area = base * altezza;
    }
}
