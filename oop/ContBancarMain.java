package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip cont bancar
        // instante ale clasei cont bancar

        ContBancar cont1 = new ContBancar("Iuliana Lefter", "Ro001");
        ContBancar cont2 = new ContBancar("Catalin Lefter", "Ro002");

        System.out.println("Titular" + cont1.titularCont);
        System.out.println("Titular" +cont2.titularCont);
        System.out.println(cont1.activ);
        System.out.println(cont1.IBAN);
        System.out.println(cont1.sold);
        // apelam metoda descrie
        cont1.descriere();
        cont2.descriere();
// activam conturile
        cont1.activareCont();
        cont2.activareCont();
        cont1.descriere();
        cont2.descriere();

    }
}
