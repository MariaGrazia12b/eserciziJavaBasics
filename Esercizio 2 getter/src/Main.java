// Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà
// cilindrata, targa, marca e modello. Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore. Nel main dichiarare un oggetto di tipo Auto.
public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto(2000, "LT123CD", "Fiat", "500");

        System.out.println("Cilindrata: " + myAuto.getCilindrata() + " cc");
        System.out.println("Targa: " + myAuto.getTarga());
        System.out.println("Marca: " + myAuto.getMarca());
        System.out.println("Modello: " + myAuto.getModello());

    }
}