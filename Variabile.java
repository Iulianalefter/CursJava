public class Variabile { // clasa incepe aici


    public static void main(String[] args) {
        System.out.println("Hello World");

        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed, trebuie sa specificam tipul de date

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascriere

        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //  declarare
        String nume;
        String prenume;
        // initializare
      nume= "Lefter";
      prenume = "Iuliana";
      int varsta = 32;
        System.out.println(nume);
        System.out.println(prenume);

        // concatenare de stringuri

        System.out.println(prenume + " " + nume + varsta);
    }
}

