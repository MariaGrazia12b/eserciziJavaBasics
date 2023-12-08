import java.math.BigDecimal;

//Crea una classe Prodotto che rappresenti i prodotti in vendita.
//I prodotti hanno attributi come nome, prezzo e quantità in magazzino.
public class Prodotto {
    private String nome;
    private BigDecimal prezzo;
    private int quantitaNelMagazzino;

    public Prodotto(String nome, BigDecimal prezzo, int quantitaNelMagazzino) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaNelMagazzino = quantitaNelMagazzino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantitaNelMagazzino() {
        return quantitaNelMagazzino;
    }

    public void setQuantitaNelMagazzino(int quantitaNelMagazzino) {
        this.quantitaNelMagazzino = quantitaNelMagazzino;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", quantitaNelMagazzino=" + quantitaNelMagazzino +
                '}';
    }
}
