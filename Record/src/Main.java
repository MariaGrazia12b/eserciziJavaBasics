//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(41.8992, 12.5450);
        Punto punto2 = new Punto(63.8772, 14.5908);
        Punto punto3 = new Punto(70.9782, 10.5670);
        Punto punto4 = new Punto(41.8992, 12.5450);

        Map<String, Punto> listaCoordinate = new HashMap<>();
        listaCoordinate.put("Coordinate1 ", punto1);
        listaCoordinate.put("Coordinate2 ", punto2);
        listaCoordinate.put("Coordinate3 ", punto3);
        listaCoordinate.put("Coordinate4 ", punto4);

        System.out.println("Lista coordinate: " + listaCoordinate);


        boolean sonoUguali = punto1.equals(punto4);
        System.out.println("Le coordinate del punto 1 e quelle del punto 4 sono uguali? " + sonoUguali);

        System.out.println("La longitudine (y) del punto 2 è: " + punto2.y());

    }
}