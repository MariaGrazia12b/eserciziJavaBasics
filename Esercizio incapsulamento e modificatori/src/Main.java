// Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà
// cilindrata, targa, marca e modello. Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore. Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.


public class Main {
    public static void main(String[] args) {
        //PROMEMORIA per me: oggetto di tipo Auto utilizzando il costruttore.
        Auto miaAuto = new Auto(2000, "ZL944ZL", "Volswagen", "T-Cross");


        //PROMEMORIA per me: accedo alle proprietà attraverso i metodi e stampo le info.
        System.out.println("Cilindrata: " + miaAuto.getCilindrata());
        System.out.println("Targa: " + miaAuto. getTarga());
        System.out.println("Marca: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());

        //metodo set per la modifica della targa.
        miaAuto.setTarga("GH654JK");
        //stampa aggiornata.
        System.out.println("Nuova targa: " + miaAuto.getTarga());

    }
}