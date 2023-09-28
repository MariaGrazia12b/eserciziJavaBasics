// Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo 
// per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
// Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.

public class SwitchStatement2 {
    public static void main(String args[]) {
        char caracter = '$';
        System.out.println(operation(caracter));
    }
    public static String operation(char caracter) {
        String result = "";
        switch(caracter) {
            case '+':
                result = "Addizione";
                break;
            case '-':
                result = "Sottrazione";
                break;
            case '*':
                result = "Moltiplicazione";
                break;
            case '/':
                result = "Divisione";
                break;
            default:
                result = "Errore";
        }
    return result;
    }
}