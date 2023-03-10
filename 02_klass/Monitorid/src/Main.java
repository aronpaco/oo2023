import java.util.Date;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Monitor Samsung_S24D330 = new Monitor("Samsung",
                24, 1920, 1080);
        Monitor LG_29WN600 = new Monitor("LG",
                29, 2560, 1080);
        Monitor AOC_something = new Monitor("AOC",
                27, 2560, 1440);

        Purchase purchase = new Purchase(new Buyer("Mati", "mati@mail.ee"), 109.99, "Cash");
        Purchase purchase2 = new Purchase(new Buyer("Aino", "aino@gmail.com"), 249.90, "Cash");

        purchase2.discount(20);
        System.out.println("Soodushind on ");
        System.out.print(round(purchase2.price));

    /*    new Date();
        java.time.LocalDateTime.now();
        System.out.println(java.time.LocalDate.now());  */

        Samsung_S24D330.setAspectRatio();
        Samsung_S24D330.setDiagonal();
        System.out.println();
        LG_29WN600.setAspectRatio();
        LG_29WN600.setDiagonal();
        System.out.println();
        AOC_something.setAspectRatio();
        AOC_something.setDiagonal();
        System.out.println();


    }
}