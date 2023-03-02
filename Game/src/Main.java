import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Random rand = new Random(); // uus instants
        //  Math.random(); // static


        /*System.out.println("Hello world!");
        String sonaline = "Sõnaline muutuja";
        char yhetaheline = 's';
        double komakohaga = 123.123123; // 64-bitine täpsus
        float komakohaga2 = 123.123F; // 32-bitine täpsus
        boolean kahendvaartus = true; // 0 ja 1
        byte pisikeNumber = 127;
        short lyhikeNumber = -32767;
        long pikkNumber = 123123123; // 8 bytes, rohkem kui int(4)*/
        // sout; fori

        Scanner scanner = new Scanner(System.in);


        World world = new World(10, 5);

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol);
        String input = scanner.nextLine();
//        for (; playerYCoordinate < 2; y++) {
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }
}