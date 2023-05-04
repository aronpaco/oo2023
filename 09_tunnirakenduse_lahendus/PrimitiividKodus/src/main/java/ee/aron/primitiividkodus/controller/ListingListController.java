package ee.aron.primitiividkodus.controller;

import ee.aron.primitiividkodus.model.Listing;
import ee.aron.primitiividkodus.model.Seller;
import ee.aron.primitiividkodus.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListingListController {
    @Autowired
    VehicleListController vehicleListController;
    @Autowired
    SellerListController sellerListController;
    /*
    List<Vehicle> vehicleListing = new ArrayList<>(Arrays.asList(
            new Vehicle(1, "BMW", "316i", 2500),
            new Vehicle(2, "Mercedes-Benz", "C 220", 1500)
    ));
    */

    Vehicle vehicle1 = new Vehicle(1, "BMW", "316i", 2500);
    Seller seller1 = new Seller(1, "Guido", "5123123");
    List<Listing> listings = new ArrayList<>(Arrays.asList(
            new Listing(1, vehicle1, seller1, true),
            new Listing(1, vehicle1, seller1, true)
    ));

    @GetMapping("listings")
    public List<Listing> getListings() {
        return listings;
    }

}
