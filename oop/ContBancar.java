package oop;

public class ContBancar {
    // program files; definim logica unui cont bancar

    // program files- definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    //oop clasa = est un tip nou
    // este definitia unui concept; conceptualizare teoretica a unei entitati practice; blueprint
    // reteta la paste carbonara, ADN-ul uman
    // ex: clasa car

    // un obiect = instanta unei clase; implementarea clasei
    // obiect = paste carbonara, un om
    // ex: 10 obiecte de tip car

    // fields= proprietati, atribute- sunt de fapt variabilele
    // ex: culoare, marca, model, consum, pret

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschide usa(), vopsire()

    // atributele, proporiettai, fielduri
    String titularCont;
    String IBAN;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;

    // constructor= are rolul de a impune date de start
    // ca si *  din formulare, required fileds

    public ContBancar(String titularCont, String IBAN) {
        this.titularCont = titularCont;
        this.IBAN = IBAN;

    }

    // metode
    public void descriere(){
        System.out.println("Titular" + this.titularCont);
        System.out.println("status" + this.activ);
        System.out.println("iban" + this.IBAN);
        System.out.println(this.sold);
    }

    // activare cont - modifica activ in True doar daca pin-ul e corect

    public void activareCont(int pinUtilizator){
        if (pinUtilizator == this.pin){
            this.activ = true;
        } else{
            System.out.println("pin gresit");
        }


    }
}
