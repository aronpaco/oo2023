package ee.aron.primitiividkodus.controller;

import ee.aron.primitiividkodus.model.Listing;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListingListController {
    List<Listing> listings = new ArrayList<>(Arrays.asList(
            new Listing(1,"Mercedes-Benz", "C 180 T", 1500, true),
            new Listing(2, "Audi", "A3", 9000, true),
            new Listing(3, "BMW", "X5", 15000, true),
            new Listing(4, "Volkswagen", "Golf", 5000, true),
            new Listing(5, "Ford", "Fiesta", 3000, false)
    ));
    @GetMapping("listings")
    public List<Listing> getListings() {
        return listings;
    }
    @GetMapping("add-listing/{id}/{brand}/{model}/{price}/{active}")
    public List<Listing> addListing(
            @PathVariable int id,
            @PathVariable String brand,
            @PathVariable String model,
            @PathVariable int price,
            @PathVariable boolean active) {
        listings.add(new Listing(id, brand, model, price, active));
        return listings;
    } // http://localhost:8080/add-listing/6/Cadillac/Escalade/20000/true
    @GetMapping("delete-listing/{target_id}")
    public List <Listing> deleteListing(@PathVariable int target_id) {
        listings.removeIf(listing -> listing.getId()==(target_id));
        return listings;
    }
    @GetMapping("change-price/{target_id}/{new_price}")
    public List<Listing> changePrice(@PathVariable int target_id, @PathVariable int new_price) {
        for (Listing listing : listings) {
            if (listing.getId() == target_id) {
                listing.setPrice(new_price);
                break;
            }
        }
        return listings;
    }
    @GetMapping("discount-all/{percentage}")
    public List<Listing> discountPrice(@PathVariable int percentage) {
        if (percentage >=0 && percentage <= 100) {
            for (Listing listing : listings) {
                int oldPrice = listing.getPrice();
                int newPrice = oldPrice * (100 - percentage) / 100;
                listing.setPrice(newPrice);
            }
        }
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
