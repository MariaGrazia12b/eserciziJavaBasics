// Scrivere un programma che contenga una classe che definisce uno Studente che abbia come
// proprietà nome, cognome ed identificativo. Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore. Nel main dichiarare un oggetto di tipo Studente.
public class Main {
    public static void main(String[] args) {
        // Dichiarazione e creazione di un oggetto di tipo Studente
        Studente studente1 = new Studente("Romeo", "Dante",12);

        // Utilizzo dei metodi getter per ottenere le informazioni
        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Identificativo: " + studente1.getIdentificativo());
    }

}