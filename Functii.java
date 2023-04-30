import java.sql.SQLOutput;

public class Functii {

    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie(nu pot instala Firefox in Chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns(nu are return)
    // nu are parametri

    public static void printGreeting(){
        System.out.println("Buna ziua!Bine ati venitt");
    }

    // o functie simpla care saluta clientul in functie de numele lui
    // nu ne da niciun raspuns(nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua" + nume + " " + prenume);

    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma nr. va avea returns
    // are nevoie de parametri
    // ce tip de date ca avea raspunsul?

    public static double mediaNr(double a, double b, double c){
        double media =( a + b +c )/3;
        return media;

    }

    // o functie care ne va valoare lui pi
    // ne da un raspuns
    // raspunsul va fi double
    // nu are nevoie de parametri
    // nu are parametri dar are return

    public static double piValue(){

        // constanta - variabila care nu poate fi suprascrisa

        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // CRTL + click pe f - ne duce la corpul ei

       // apelam o functie cu parametri oferind argumente
        printGreetingByName("Lefter", "Iuliana");
        printGreetingByName("lefter" , "Catalin");

        System.out.println(mediaNr(3,3,3));

        // salvam intr-o variabila

        double media1 = mediaNr(31233, 2222, 343);
        double media2 = mediaNr(33,45,33);
        System.out.println(media1);
        System.out.println(media2);

        // printam PI valuea

        System.out.println(piValue());

        // tema: aria unui dreptunghi
        // aria cercului
        // suma a 2 nr
        // functie care returneaza cate caractere are numele + prenumele


    }
}
