public class StringFuncion {
    public static void main(String args[]){
        String word = "watermelon";
        System.out.println("Length: " + length(word));
    }
    public static int length(String word){
        int wordLength = word.length();
        return wordLength;
    }
}