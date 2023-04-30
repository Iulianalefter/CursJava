import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // if else: evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("pornim radio");

        boolean piesa_faina = false;//invat calculatorul daca piesa e faina sau nu
        // daca imi place piesa, dau mai tare

        if (piesa_faina == true){
            System.out.println("dau mai tare radioul");
            System.out.println("incep sa o fredonez");
        }
        System.out.println("oprim radio");
        // if else

        int numar =4;
        if(numar % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }

        // este un numar pozitiv?

        if (numar > 0){
            System.out.println("pozitiv");

        }else{
            System.out.println("Nu este pozitiv");
        }

        // if, if else, else
        // luam date de la tastura
       Scanner sc = new Scanner(System.in);
        System.out.println("introdu ora: ");
        int ora = sc.nextInt();
        if(ora < 0){
            System.out.println("ora invalida");
        }else if(ora <= 11){
            System.out.println("buna dimineata");
        }else if(ora <= 18){
            System.out.println("buna ziua");
        }else if(ora <= 21){
            System.out.println("buna seara");
        }else if(ora <= 24){
            System.out.println("noapte buna");
        }else {
            System.out.println("ora invalida");
    }

        // contorizam viteza unei masini
        // <0 viteza invalida, 0 stationeaza, <= 50 localitate, <= 90 drum judetean, autostrada
        // flow control
        // switch se foloseste cand stim valorile posibile

        System.out.println("Alege optiunea:");
        int optiunea = sc.nextInt();
        switch (optiunea){
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("en");
            default:
                System.out.println("ai ales invalid");
        }


    }
}
