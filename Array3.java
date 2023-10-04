// Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
        // L'array ottenuto dovrà essere stampato a video.

// PREMESSA: HO AGGIUNTO DEI COMMENTI PASSO PASSO PERCHE' ALTRIMENTI MI PERDO QUANDO LO RILEGGO. QUESTO ESERCIZIO MI HA
// MESSO IN GRANDE DIFFICOLTA'.
public class Array3 {

    public static void main(String[] args) {
        int[] arrayWithDupli = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 4};
        
        System.out.println("Original array:");
        printArray(arrayWithDupli);
        
        removeDupli(arrayWithDupli);
        
    }

    // Metodo per rimuovere gli elementi duplicati da un array di interi
    public static void removeDupli(int[] array) {
        int firstLength = array.length;
        int finalLength = 0;

        for (int i = 0; i < firstLength; i++) {
            boolean dupli = false;

            // Verifica se l'elemento è già stato visto
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    dupli = true;
                    break;
                }
            }

            // Se non è un duplicato, aggiungi all'array senza duplicati
            if (!dupli) {
                array[finalLength] = array[i];
                finalLength++;
            }
        }
        
        System.out.println("New Array:");
        for(int k = 0; k < finalLength; k++)
        {
            System.out.print(array[k] + " ");
        }
        
    }

    // Metodo per stampare un array di interi
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
}