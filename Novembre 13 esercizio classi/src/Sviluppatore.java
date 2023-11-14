import java.math.BigDecimal;

public class Sviluppatore extends Lavoratore {
    private String linguaggio;

    public Sviluppatore(String nome, String cognome, String linguaggio, BigDecimal stipendio,double bonus) {
        super(nome, cognome, bonus, stipendio);
        this.linguaggio = linguaggio;
    }

    public BigDecimal calcolaStipendio () {
        return this.getStipendio();
    }
    public String infoImpiegati () {
        return "Nome: " + this.getNome() + " Cognome: " + this.getCognome() + " Linguaggio: " + this.linguaggio + " Stipendio: "
                + this.getStipendio() + " Bonus: " + this.getBonus();
    }
}
