import java.util.*;

public class Main {
// kirjutasin selle arvutis

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

        Item sword = new Item(10, 1, "Mõõk", world.width, world.height);
        Item hammer = new Item(5, 3, "Haamer", world.width, world.height);
        Item boot = new Item(1, 10, "Saabas", world.width, world.height);

        // import! java.util.List
        // import: java.util.ArrayList
        //                            import: java.util.Arrays
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));
        // List -> muudetav

        // Item[] items1 = {sword, hammer, boot};
        // Array -> ei ole muudetav (read-only)


        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol, items);
        String input = scanner.nextLine();
//        for (; playerYCoordinate < 2; y++) {
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinate, player.yCoordinate, player.symbol,
                    dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                    orc.xCoordinate, orc.yCoordinate, orc.symbol, items);
            System.out.println();
            for (Item i : items) {
                if (i.xCoordinate == player.xCoordinate && i.yCoordinate == player.yCoordinate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}