import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double x1 = 1;
        double x2 = 2;
        double x3 = 3;
        double y1 = 1;
        double y2 = 3;
        double y3 = 1;

        List<Double> xCoords = new ArrayList<>(Arrays.asList(x1,x2,x3));
        List<Double> yCoords = new ArrayList<>(Arrays.asList(y1,y2,y3));

        Kolmnurk kolmnurk = new Kolmnurk(xCoords, yCoords);

        System.out.println(kolmnurk.xCoords);
        System.out.println(kolmnurk.yCoords);

        double loikA = x1
    }

}