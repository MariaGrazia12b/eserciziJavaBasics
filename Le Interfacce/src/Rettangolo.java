class Rettangolo implements Forma {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
       return base * altezza;
    }
}
