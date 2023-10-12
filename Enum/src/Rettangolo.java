class Rettangolo extends Forma {
    private double base;
    private double altezza;
    private final TipoForma tipoForma = TipoForma.RETTANGOLO;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        double area = base * altezza;
        System.out.println("del rettangolo: " + area);
    }

    public TipoForma getTipoForma() {
        return tipoForma;
    }
}
