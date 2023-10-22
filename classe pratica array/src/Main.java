public class Main {
    public static void main(String[] args) {
        Studente [] studenti = new Studente[3];
        studenti[0] = new Studente("Maria", "Bella",14,9);
        studenti[1] = new Studente("Romeo","Super",10,10);
        studenti[2] = new Studente("Gianni","Katsigiannis", 3,6);

        Studente piuBravo = calcoloMediaPiuAlta(studenti);
        System.out.println("Lo studente con media più alta è: " + piuBravo.getName());


    }
    public static Studente calcoloMediaPiuAlta(Studente [] studenti) {
        Studente conMediaPiuAlta = studenti[0];
        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i].getMediaScolastica() > conMediaPiuAlta.getMediaScolastica()) {
                conMediaPiuAlta = studenti[i];
            }
        }
        return conMediaPiuAlta;
    }
}