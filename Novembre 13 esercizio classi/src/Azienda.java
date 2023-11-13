import java.util.ArrayList;
import java.util.List;

public class Azienda  {
    private List<Manager> listaManager;
    private List<Sviluppatore> listaSviluppatori;

    public Azienda(List<Manager> listaManager, List<Sviluppatore> listaSviluppatori) {
        this.listaManager = listaManager;
        this.listaSviluppatori = listaSviluppatori;
    }

    public void aggiungiManager (Manager manager) {
        this.listaManager.add(manager);
    }
    public void aggiungiSviluppatore (Sviluppatore sviluppatore) {
        this.listaSviluppatori.add(sviluppatore);
    }
    public void infoAzienda () {
        for (Manager manager : listaManager) {
            System.out.println("Manager: " + manager.infoImpiegati());
        }
        for (Sviluppatore sviluppatore : listaSviluppatori) {
            System.out.println("Sviluppatore: " + sviluppatore.infoImpiegati());
        }
    }
}
