public class Libro {
    private int id;
    private String titolo;
    private String autore;
    private int annoPubl;
    private Boolean seDisponibile;

    public Libro(int id,String titolo, String autore, int annoPubl, Boolean seDisponibile){
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubl = annoPubl;
        this.seDisponibile = seDisponibile;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubl() {
        return annoPubl;
    }

    public void setAnnoPubl(int annoPubl) {
        this.annoPubl = annoPubl;
    }

    public boolean getisSeDisponibile() {
        return seDisponibile;
    }

    public void setSeDisponibile(boolean seDisponibile) {
        this.seDisponibile = seDisponibile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubl=" + annoPubl +
                ", seDisponibile=" + seDisponibile +
                '}';
    }

}