import java.util.ArrayList;

//Classe Partecipante: nome; lista eventi;
public class Partecipante {
    private String nome;
    private ArrayList<Evento> listaEventi;

    public Partecipante(String nome, ArrayList<Evento> listaEventi) {
        this.nome = nome;
        this.listaEventi = listaEventi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Evento> getListaEventi() {
        return listaEventi;
    }

    public void setListaEventi(ArrayList<Evento> listaEventi) {
        this.listaEventi = listaEventi;
    }

    @Override
    public String toString() {
        return "Partecipante{" +
                "nome='" + nome + '\'' +
                ", listaEventi=" + listaEventi +
                '}';
    }
}
