import java.math.BigDecimal;

public class Manager extends Lavoratore {

    public Manager(String nome, String cognome, double bonus, BigDecimal stipendio) {
        super(nome, cognome, bonus, stipendio);
    }
    public BigDecimal calcolaStipendio () {
        return this.getStipendio().multiply(BigDecimal.valueOf(this.getBonus()));
    }
    public String infoImpiegati () {
        return "Nome: " + this.getNome() + " Cognome: " + this.getCognome() + " Bonus: " + this.getBonus() +
                " Stipendio: " + this.getStipendio();
    }
}
