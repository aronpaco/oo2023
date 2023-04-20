import static java.lang.Math.round;

public class Garage extends RealEstate implements Calculations {

    public Garage(double squareMeters, int yearBuilt, String location) {
        super(squareMeters, yearBuilt, location);
    }

    @Override
    public double getPricePerSquareMeter() {
        double pricePerSquareMeter = 500;
        if (location == "Tallinn") {
            pricePerSquareMeter += 200;
        } else if (location == "Tartu") {
            pricePerSquareMeter += 100;
        }

        double yearMultiplier = 1;
        for (int i = 1991; i <= yearBuilt; i++) {
            yearMultiplier += 0.025;
        }
        pricePerSquareMeter *= yearMultiplier;

        if (squareMeters >= 36) {
            pricePerSquareMeter += 50;
        }

        return round(pricePerSquareMeter);
    }
    @Override
    public double getPrice() {
        return squareMeters * getPricePerSquareMeter();
    }
}
