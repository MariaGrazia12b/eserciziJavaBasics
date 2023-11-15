import java.util.ArrayList;
import java.util.Scanner;

public class NoleggioVeicoli {
    private static ArrayList<Veicolo> veicoli;
    private ArrayList<Utente> utenti;
    private ArrayList<NoleggioVeicoli> storico;

    public NoleggioVeicoli(ArrayList<Veicolo> veicoli, ArrayList<Utente> utenti, ArrayList<NoleggioVeicoli> storico) {
        this.veicoli = veicoli;
        this.utenti = utenti;
        this.storico = storico;
    }

    public static ArrayList<Veicolo> getVeicoli() {
        return veicoli;
    }


    public static void setVeicoli(ArrayList<Veicolo> veicoli) {
        NoleggioVeicoli.veicoli = veicoli;
    }

    public ArrayList<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(ArrayList<Utente> utenti) {
        this.utenti = utenti;
    }

    public ArrayList<NoleggioVeicoli> getStorico() {
        return storico;
    }

    public void setStorico(ArrayList<NoleggioVeicoli> storico) {
        this.storico = storico;
    }
    public static void addVeicolo(Veicolo veicolo){
        veicoli.add(veicolo);
    }
    static Veicolo selezioneVeicolo() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veicolo> veicoli = NoleggioVeicoli.getVeicoli();
        for(int i = 0; i < veicoli.size(); i++) {
            if(!veicoli.get(i).getNoleggiato()) {
                System.out.println(veicoli.get(i) + " " +i);
            }
        }
        int selected = sc.nextInt();
        return veicoli.get(selected);

    }
}
