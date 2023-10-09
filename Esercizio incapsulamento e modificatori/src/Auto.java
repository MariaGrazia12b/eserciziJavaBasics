public class Auto {
    // promemoria per me: proprietà della classe auto che dichiaro private per mantenere l'incapsulamento.
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    // costruttore. promemoria per me: viene utilizzato per inizializzare le proprietà al momento
    // della creazione di un oggetto.
    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    //PROMEMORIA getter metodi accessori: accedere alle proprietà.
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

    //PROMEMORIA setter metodi mutatori: permettono di modificare le proprietà.
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModello(String modelo) {
        this.modello = modello;
    }
}
