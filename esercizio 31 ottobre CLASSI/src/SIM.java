import java.math.BigDecimal;
import java.util.ArrayList;

public class SIM {
   private double numero;
   private BigDecimal credito;
   private ArrayList<Chiamata> telefonateEffettuate;

   public double getNumero() {
      return numero;
   }

   public void setNumero(double numero) {
      this.numero = numero;
   }

   public BigDecimal getCredito() {
      return credito;
   }

   public void setCredito(BigDecimal credito) {
      this.credito = credito;
   }

   public ArrayList<Chiamata> getTelefonateEffettuate() {
      return telefonateEffettuate;
   }

   public void setTelefonateEffettuate(ArrayList<Chiamata> telefonateEffettuate) {
      this.telefonateEffettuate = telefonateEffettuate;
   }

   public SIM(double numero, BigDecimal credito, ArrayList<Chiamata> telefonateEffettuate) {
      this.numero = numero;
      this.credito = credito;
      this.telefonateEffettuate = telefonateEffettuate;
   }
   //un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
   public void inserimentoTelefonata(Chiamata chiamata) {
      this.telefonateEffettuate.add(chiamata);
   }
   //una funzione per il calcolo dei minuti totali di conversazione.
   public int calcoloMinutiTotali() {
      int minutiTotali = 0;
      //ogni volta che accedo ad un attributo della classe ci vuole this e quindi il metodo non è static.
      for (Chiamata chiamata : this.telefonateEffettuate) {
         minutiTotali = minutiTotali + chiamata.getMinutiChiamata();
      }
      return minutiTotali;
   }
   //una funzione per il calcolo delle telefonate effettuate verso un certo numero
   public int calcoloTelefonate(double numeroDestinatario) {
      int totaleChiamate = 0;
      for ( Chiamata chiamata : this.telefonateEffettuate) {
         if (chiamata.getNumeroDestinatarioChiamata() == numeroDestinatario) {
            totaleChiamate ++;
         }
      }
      return totaleChiamate;
   }
   //una procedura per la stampa dei dati della SIM e l'elenco delle telefonate

   @Override
   public String toString() {
      return "SIM{" +
              "numero=" + numero +
              ", credito=" + credito +
              ", telefonateEffettuate=" + telefonateEffettuate +
              '}';
   }
}


