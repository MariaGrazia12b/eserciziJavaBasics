public class Animali {
    private String nome1;
    private String nome2;

    public Animali(String nome1, String nome2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    @Override
    public String toString() {
        return "Animali{" +
                "nome1='" + nome1 + '\'' +
                ", nome2='" + nome2 + '\'' +
                '}';
    }
}