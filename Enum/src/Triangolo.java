class Triangolo extends Forma {
    private double base;
    private double altezza;
    private final TipoForma tipoForma = TipoForma.TRIANGOLO;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        double area = (base * altezza) / 2;
        System.out.println("del triangolo: " + area);
    }

    public TipoForma getTipoForma() {
        return tipoForma;
    }

}
