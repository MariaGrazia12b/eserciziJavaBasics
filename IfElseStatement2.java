// Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza 
// stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".

public class IfElseStatement2 {
    public static void main(String args []) {
        String word = "Principessa";
        System.out.println("Word: " + word);
        System.out.println(wordLength(word));
    
    }
    public static String wordLength(String word) {
        int length = word.length();
        String result = "";
        if(word.length() > 10) {
            result = "Lunghezza maggiore di 10";
        } else if(word.length() < 10) {
            result = "Lunghezza minore di 10";
        } else if(word.length() == 10) {
            result = "Lunghezza pari a 10";
        }
        return result;
    }
}