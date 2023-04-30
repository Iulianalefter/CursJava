import java.sql.SQLOutput;

public class For {
    public static void main(String[] args) {
        // for - loop, structura repetitiva
        // de unde incepem
        // pana unde mergem
        // pasul de parcurgere
        // problema: printam 101 dalmatieni

        for (int i = 0; i <=101; i++) {
            System.out.println("Dalmatianul cu nr"  + i);

        }

            // ne ajuta sa parcurgemn un array prin intermediul indexului
        int [] numere = {3,7,3,7}; //numere[0] = 3
        for (int i = 0; i< numere.length; i++) {
            System.out.println("Elementul are  index " + i + "si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare

        for (int numar : numere){
            System.out.println("numarul este" + numar);
        }

        // parcurgem array de culori

        String[] culori = {"alb", "rosu", "galben"};
        for(String culoare: culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma numerelor din array

        int s = 0;

        for (int numar : numere) { // 3

            s = s+ numar;
            System.out.println(s);

        }








    }
}
