// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayMulti2 {
    public static void main(String[] args)
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