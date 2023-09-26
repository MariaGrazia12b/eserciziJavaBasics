public class StringFuncion {
    public static void main(String args[]){
        String word = "watermelon";
        System.out.println("Length: " + length(word));
    }
    public static String length(String word){
        int wordLength = word.length();
        return String.valueOf(wordLength);
    }
}