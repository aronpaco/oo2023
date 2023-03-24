public class Item implements WorldObject {
    int xCoordinate;
    int yCoordinate;
    int strength;
    int durability;
    String name;

    // rmb > generate > constructor > hold ctrl, select every muutuja > ok
    public Item(int strength, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }
    public int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
        // returni järel tuleb täisarv
    }
}