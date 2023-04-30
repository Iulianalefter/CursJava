/*
Recap:
Variabile
Tipuri de date: char, string, int, float/double, boolean

Operatori:

aritmetici: +, -,*, /,%(modulo)
de comparare: < >, ==, !=, >=, <=
logici: &&,(si) ||(sau) !(not- se inverseaza raspunsul)

Flow control - if else

if else - evalueaza conditii si bifurca codul in functie de rezultat
 */


public class Operatori {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = b;
        // printam restul impartirii
        System.out.println(a % b);

        // operatori de comparare
        System.out.println(a != b); //5 diferit de 5? - false
        System.out.println(a == b); // 5 egal cu 5? - true
        System.out.println(7>b && 3>b); // 7>5 SI 3>5?
        System.out.println(7>b || 3>b); // 7>5 sau 3>5?
        System.out.println(7>b || (2>b|| 3>b)); // true && false
        System.out.println(!(7>6)); //!true devine false


    }
}
