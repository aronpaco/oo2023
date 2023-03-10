import java.util.List;

public class World {
    int width = 10;
    int height = 5;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                         int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                         int orcXCoordinate, int orcYCoordinate, char orcSymbol, List<Item> items) {
        // algväärtus kuni iga tsükkel
        char symbol = ' '; // luuakse uus muutuja (deklareerimine), esmakordne väärtuse andmine initsialiseerimine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1) { //kui esimene sobib, siis teise "või" juurde ei lähe
                    //System.out.print("-");
                    symbol = '-';
                } else if (x == 0 || x == worldWidth -1) {
                    //System.out.print("|");
                    symbol = '|';
                } else {
                    // ctrl+alt+m
                    // right click; refactor; extract method
                    for (Item i : items) {
                        if (i.yCoordinate == y && i.xCoordinate == x) {
//                            System.out.print("I");
                            symbol = 'I';
                            break;
                        }
                    }
                    if (playerXCoordinate == x && playerYCoordinate == y) {   // aktiveerin; right click; refactor; rename
//            System.out.print(playerSymbol);
                        symbol = playerSymbol;
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) {
//            System.out.print(dragonSymbol);
                        symbol = dragonSymbol;
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
//            System.out.print(orcSymbol);
                        symbol = orcSymbol;
                    }
                }
                System.out.print(symbol);
                symbol = ' ';

                    /* symbol printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x) {
                    }
                    System.out.print(symbol);
                    symbol = ' '; */
                }
            }
        }
    }

//    // int on tagastustüüp ehk mis järgneb return kirjele // uus kommentaar
//    private static int getRandomCoordinate(int worldDimension) {
//        return (int) (Math.random() * (worldDimension - 2) + 1);
//        // returni järel tuleb täisarv
//    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastata midagi
   /* private char printCharacters(int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                                        int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                                        int orcXCoordinate, int orcYCoordinate, char orcSymbol, int mapY, int mapX) { */