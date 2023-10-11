class Triangolo extends Forma {
    private double base;
    private double altezza;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double calcolaArea() {
        return area = (base * altezza) / 2;
    }
}
