public class Main {



    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        String sonaline = "Sõnaline muutuja";
        char yhetaheline = 's';
        double komakohaga = 123.123123; // 64-bitine täpsus
        float komakohaga2 = 123.123F; // 32-bitine täpsus
        boolean kahendvaartus = true; // 0 ja 1
        byte pisikeNumber = 127;
        short lyhikeNumber = -32767;
        long pikkNumber = 123123123; // 8 bytes, rohkem kui int(4)*/

        int playerXCoordinate = 3; // int on täisarvuline number
        int playerYCoordinate = 3;
        int dragonXCoordinate = 6;
        int dragonYCoordinate = 2;
        int orcXCoordinate = 5;
        int orcYCoordinate = 1;

        // sout; fori
        // algväärtus kuni iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) { //kui esimene sobib, siis teise "või" juurde ei lähe
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinate == x && playerYCoordinate == y) {
                        System.out.print("X");
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) {
                        System.out.print("D");
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}