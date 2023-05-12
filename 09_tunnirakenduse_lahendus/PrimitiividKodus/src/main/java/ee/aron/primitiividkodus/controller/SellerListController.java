package ee.aron.primitiividkodus.controller;

import ee.aron.primitiividkodus.model.Seller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SellerListController {
    List<Seller> sellers = new ArrayList<>(Arrays.asList(
            new Seller(1,"Madis", "51234567"),
            new Seller(2,"Rasmus Tamm", "rasmus@gmail.com"),
            new Seller(3,"Kerk", "51634517"),
            new Seller(4,"Kalle", "53456123"),
            new Seller(5,"Malle Maasikas", "5999222")
    ));
    @GetMapping("sellers")
    public List<Seller> getSellers() {
        return sellers;
    }
    @GetMapping("add-seller/{id}/{name}/{contact}")
    public List<Seller> addSeller(
            @PathVariable int id,
            @PathVariable String name,
            @PathVariable String contact) {
        sellers.add(new Seller(id, name, contact));
        return sellers;
    } // http://localhost:8080/add-seller/6/Kati/56911112
    @GetMapping("delete-seller/{target_id}")
    public List <Seller> deleteSeller(@PathVariable int target_id) {
        sellers.removeIf(seller -> seller.getId()==(target_id));
        return sellers;
    }
    @GetMapping("change-name/{target_id}/{new_name}")
    public List<Seller> changeName(@PathVariable int target_id, @PathVariable String new_name) {
        for (Seller seller : sellers) {
            if (seller.getId() == target_id) {
                seller.setName(new_name);
                break;
            }
        }
        return sellers;
    }

    @GetMapping("change-contact/{target_id}/{new_contact}")
    public List<Seller> changeContact(@PathVariable int target_id, @PathVariable String new_contact) {
        for (Seller seller : sellers) {
            if (seller.getId() == target_id) {
                seller.setContact(new_contact);
                break;
            }
        }
        return sellers;
    }

}
