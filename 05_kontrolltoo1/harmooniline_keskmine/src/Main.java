import java.util.ArrayList;

import static java.lang.Long.sum;

public class Main {
    public static void main(String[] args) {
        findAverage(10, 15);

        double averageSpeedList = getAverageSpeedList();
        System.out.println(averageSpeedList);
    }

    private static void findAverage(double speed1, double speed2) {
        double findAverage = (speed1 + speed2) / 2;
        System.out.println(findAverage);
    }
    private static double getAverageSpeedList() {
        ArrayList<Double> speeds = new ArrayList<Double>();
        speeds.add(149.0);
        speeds.add(142.0);
        speeds.add(140.0);
        speeds.add(150.0);
        double averageSpeedList = 0;
        double total = 0;
        for (int i = 0; i < speeds.size(); i++) {
            total += speeds.get(i);
            averageSpeedList = total / speeds.size();
        }
        return averageSpeedList;
    }
}
       /* ArrayList<Double> speeds = new ArrayList<Double>();
        speeds.add(149.0);
        speeds.add(142.0);
        speeds.add(140.0);
        speeds.add(150.0);
        System.out.println("Kiirused: " + speeds);
        System.out.println("Kilomeetrid: " + speeds.size());
        double total = 0;
        double averageSpeedList = 0;
        for (int i = 0; i < speeds.size(); i++) {
            total += speeds.get(i);
            averageSpeedList = total / speeds.size();
        }
        System.out.println("Keskmine kiirus listist on " + averageSpeedList); */
