public class Utente {
    enum Doc {
        CI,
        PASSAPORTO,
        PATENTE
    }
    private String nome;
    private String cognome;
    private int eta;
    private Doc doc;
    private String tipoDoc;

    public Utente(String nome, String cognome, int eta, Doc doc, String tipoDoc) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.doc = doc;
        this.tipoDoc = tipoDoc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
}
