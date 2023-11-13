public class Manager {
    private String nome;
    private String cognome;
    private double bonus;
    private double stipendio;

    public Manager(String nome, String cognome, double bonus, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.bonus = bonus;
        this.stipendio = stipendio;
    }
    public double calcolaStipendio () {
        return this.stipendio + this.bonus;
    }
    public String infoImpiegati () {
        return "Nome: " + this.nome + " Cognome: " + this.cognome + " Bonus: " + this.bonus + " Stipendio: "
                + this.stipendio;
    }
}
