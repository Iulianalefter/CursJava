import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // declarare si intializare cand stim valorile

        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1,33,35,45,67};
        // contine mai multe elemente de acelasi tip
        // accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa
        // are proprietatea length care ne da dimnesiunea array-ului


        System.out.println(elevi[2]);
        elevi[2] = "Sebi"; //suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]);//"gigel" +"Costel"
        System.out.println(elevi.length + 5); // aduna numarul total al elevilor(length) + inca 5

        // sa printam tot timpul ultimul element indiferent de marime

        System.out.println(" Last place:"  + elevi[elevi.length - 1]); // ca si cum am scris elevi- 4

        // declarare si alocare de memorie
        int[] note = new int[5]; // 0,0,0,0,0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[1]);







    }




}
