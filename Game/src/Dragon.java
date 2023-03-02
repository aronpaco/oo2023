public class Dragon {
    int xCoordinate; // int on täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise (double to int)
    char symbol;

    public Dragon(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'D';
    }
    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
