// Dato un array non ordinato, ordinarlo secondo un criterio a propria scelta.


public class Main {
    public static void main(String[] args) {
        int [] list = {4, 7, 8, 9, 24, 67, 1};
        int [] arrayOrdinato = ordineArray(list);
        for (int i = 0; i < arrayOrdinato.length; i++) {
            System.out.println(arrayOrdinato[i]);
        }
    }
    public static int[] ordineArray(int [] list) {

      int temporaneo = 0;
      for (int i = 0; i < list.length; i ++) {
          for (int j = i; j < list.length; j++) {
              if( list[j] < list[i]) {
                  temporaneo = list[i];
                  list[i] = list[j];
                  list[j] = temporaneo;
              }
          }

      } return list;

    }
}
