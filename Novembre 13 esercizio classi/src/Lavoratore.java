import java.math.BigDecimal;

public class Lavoratore {
    private String nome;
    private String cognome;
    private double bonus;
    private BigDecimal stipendio;


    public Lavoratore(String nome, String cognome, double bonus, BigDecimal stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.bonus = bonus;
        this.stipendio = stipendio;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getStipendio() {
        return stipendio;
    }

    public void setStipendio(BigDecimal stipendio) {
        this.stipendio = stipendio;
    }
}
