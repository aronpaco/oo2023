public class Player extends Character {
    Direction direction; // 3nda tunni teema
    // Ese: xCoordinate, yCoordinate, tugevusest, kasutuskordadest, nimest
    Item item; // klassikomplekt    Player klassi sees on Item klass
    public Player(int worldWidth, int worldHeight) {
        super(worldWidth, worldHeight, 'X');
        this.direction = Direction.UP;
    }

    // public tähendab, et mõni teine klass saab ka seda funkstiooni välja kutsuda.
    // private tähendab, et seda funktsiooni saab vaid sellest klassis kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinate > 1) {
            yCoordinate = this.yCoordinate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinate < world.height - 2) {
            yCoordinate = this.yCoordinate + 1;
        } else if (direction.equals(Direction.LEFT) && this.xCoordinate > 1) {
            xCoordinate = this.xCoordinate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinate < world.width - 2) {
            xCoordinate = this.xCoordinate + 1;
        }
    }
}
