public enum Operazione {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),
    MIN("min"),
    MAX("max");
    private String simbolo;

    Operazione(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}