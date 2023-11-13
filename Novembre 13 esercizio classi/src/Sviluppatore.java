import java.math.BigDecimal;

public class Sviluppatore {
    private String nome;
    private String cognome;
    private String linguaggio;
    private double stipendio;

    public Sviluppatore(String nome, String cognome, String linguaggio, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.linguaggio = linguaggio;
        this.stipendio = stipendio;
    }
    public double calcolaStipendio () {
        return this.stipendio;
    }
    public String infoImpiegati () {
        return "Nome: " + this.nome + " Cognome: " + this.cognome + " Linguaggio: " + this.linguaggio + " Stipendio: "
                + this.stipendio;
    }
}
