import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala

        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");
//
//        // luam elemente din lista
//        System.out.println(fructe.get(0));
//
//        // cum se afla indexul unui element
//
//        System.out.println(fructe.indexOf("banana"));
//
//        // este lista goala
//        System.out.println(fructe.isEmpty());
//
//        // eliminam toate elementele din lista
//        fructe.clear();
//
//        if (fructe.isEmpty()) { // daca nu este goala
//            System.out.println(("avem ce manca"));
//
//        }else {
//            System.out.println("nu avem ce manca");
//        }
//
//   // scoatem un elemente


        // aflam dimensiunea listei
        System.out.println(fructe.size());





        // listam elementele
        System.out.println(fructe);

        // declaram o lista imutabila si o initializam cu valori

        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 37});
        System.out.println(numere);


        //declaram o lista dinamica

        String[] flowers = {"Lalea", "Liliac", "Mac", "Narcisa"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("trandafir");
        System.out.println(flowers);

        // aflam unde este macul

        int mac_index = flowerList.indexOf("Mac");

        // stergem ce este in acea pozitie
        flowerList.remove(mac_index);

        // scoatem in fucntie de valoare
        flowerList.remove("Liliac");
        System.out.println(Arrays.toString(flowerList.toArray()));

        // printam flower list
        System.out.println(flowerList);










    }
}
