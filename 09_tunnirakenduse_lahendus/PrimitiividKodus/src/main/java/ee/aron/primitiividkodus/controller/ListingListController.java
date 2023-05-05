package ee.aron.primitiividkodus.controller;

import ee.aron.primitiividkodus.model.Listing;
import ee.aron.primitiividkodus.model.Seller;
import ee.aron.primitiividkodus.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    Vehicle vehicle1 = new Vehicle(1, "BMW", "316i", 2500);
    Vehicle vehicle2 = new Vehicle(2, "Mercedes", "A 160", 1000);
    Vehicle vehicle3 = new Vehicle(3, "Volkswagen", "Golf", 2500);
    Seller seller1 = new Seller(1, "Guido", "5123123");
    Seller seller2 = new Seller(2, "Mehis", "5123123");
    Seller seller3 = new Seller(3, "Giovanni", "5123123");
    List<Listing> listings = new ArrayList<>(Arrays.asList(
            new Listing(1, vehicle1, seller1, true),
            new Listing(2, vehicle2, seller2, true),
            new Listing(3, vehicle3, seller3, true)
    ));
    @GetMapping("listings")
    public List<Listing> getListings() {
        return listings;
    }
    @GetMapping("add-listing/{id}/{vehicle}/{seller}/{activity}")
    public List<Listing> addListing(
            @PathVariable int id,
            @PathVariable Vehicle vehicle,
            @PathVariable Seller seller,
            @PathVariable boolean activity) {
        listings.add(new Listing(id, vehicle, seller, activity));
        return listings;
    }   //  localhost:8080/add-listing/10?id=10&brand=Mitsubishi&model=Pajero&price=9500?id=6&name=Joonas&contact=5123123?activity=true
    @GetMapping("delete-listing/{target_id}")
    public List <Listing> deleteListing(@PathVariable int target_id) {
        listings.removeIf(listing -> listing.getId()==(target_id));
        return listings;
    }
    @GetMapping("activate-all/{activity}") // activate-all/true; false
    public List<Listing> activateAll(@PathVariable boolean activity) {
        for (Listing listing : listings) {
            listing.setActive(activity);
        }
        return listings;
    }

}
