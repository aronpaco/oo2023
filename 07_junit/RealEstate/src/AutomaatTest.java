import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void test_House_in_Random() {
        House house = new House(100, 1975, "Loksa");
        assertEquals((1500*1*house.squareMeters), 1, house.getPrice());
    }
    @Test
    public void test_Apartment_in_Tallinn() {
        Apartment apartment = new Apartment(50, 2020, "Tallinn");
        assertEquals((1000+1500)*30*0.025, 1, apartment.getPricePerSquareMeter());
    }
    @Test
    public void test_Garage_in_Tartu() {
        Garage garage = new Garage(20, 1995, "Tartu");
        assertEquals((500+100)*(1+(garage.yearBuilt - 1990)*0.025) * garage.squareMeters, 1, garage.getPrice());
    }
}
