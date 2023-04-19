import static java.lang.Math.round;

public class Apartment extends RealEstate implements Calculations {

    public Apartment(double squareMeters, int yearBuilt, String location) {
        super(squareMeters, yearBuilt, location);
    }



    @Override
    public double getPricePerSquareMeter() {
        double pricePerSquareMeter = 1000;
        if (location == "Tallinn") {
            pricePerSquareMeter += 1500;
        } else if (location == "Tartu") {
            pricePerSquareMeter += 1000;
        }

        double yearMultiplier = 1;
        for (int i = 1990; i <= yearBuilt; i++) {
            yearMultiplier += 0.025;
        }
        pricePerSquareMeter *= yearMultiplier;

        return round(pricePerSquareMeter);
    }
    @Override
    public double getPrice() {
        double price = 0;
        price = getPricePerSquareMeter() * squareMeters;
        return (price);
    }
}

