public class While {
    public static void main(String[] args) {
        // while este un loop, ciclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        // problema: masina merge cat timp are inca benzina
        int litri_benzina = 10; // contorizam benzina
        while (litri_benzina > 0){ // aici avem 10 litri
            // acceleram
            System.out.println("vruuum vruum");
            // scadem benzina
            litri_benzina = litri_benzina - 1;

            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <=3) {
                System.out.println("se aprinde becul rosu");

            }

        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
