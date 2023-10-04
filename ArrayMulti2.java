// Scrivere un programma che contenga un metodo che permette di inizializzare una matrice 
// e di scambiare le sue righe e le sue colonne stampandola a video.
// Matrice di partenza
//1 2 3
//4 5 6
//Matrice risultato
// 1 4
// 2 5
// 3 6

//PER CAPIRNE LA LOGICA HO AVUTO DIFFICOLTA'.
public class ArrayMulti2 {
    public static void main(String args[]) 
    {
        swap();
    }
    
    public static void swap() 
    {
        int [][] matrix = {{2, 3, 4},
                           {5, 6, 7}};
        // COMMENTO PROMEMORIA PER ME STESSA: 3 SONO LE RIGHE, 2 SONO LE COLONNE.
        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 2; j++)
            {
                // COMMENTO PROMEMORIA PER ME STESSA: [J][I] INVECE DI [I][J].
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }
}