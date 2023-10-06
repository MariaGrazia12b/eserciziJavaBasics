public class Auto {
    public int cilindrata;
    public String targa;
    public String marca;
    public String modello;

    // costruttore
    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }
    // getter
    public int getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }

}
