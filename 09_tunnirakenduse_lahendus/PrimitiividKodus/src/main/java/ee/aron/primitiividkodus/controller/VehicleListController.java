package ee.aron.primitiividkodus.controller;

import ee.aron.primitiividkodus.model.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class VehicleListController {
    List<Vehicle> vehicles = new ArrayList<>(Arrays.asList(
            new Vehicle(1,"Mercedes-Benz", "C 180 T", 1500),
            new Vehicle(2, "Audi", "A3", 9000),
            new Vehicle(3, "BMW", "X5", 15000),
            new Vehicle(4, "Volkswagen", "Golf", 5000),
            new Vehicle(5, "Ford", "Fiesta", 3000)
    ));
    @GetMapping("vehicles")
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    @GetMapping("add-vehicle/{id}/{brand}/{model}/{price}")
    public List<Vehicle> addVehicle(
            @PathVariable int id,
            @PathVariable String brand,
            @PathVariable String model,
            @PathVariable int price) {
        vehicles.add(new Vehicle(id, brand, model, price));
        return vehicles;
    } // http://localhost:8080/add-vehicle/6/Cadillac/Escalade/20000/
    @GetMapping("delete-vehicle/{target_id}")
    public List <Vehicle> deleteVehicle(@PathVariable int target_id) {
        vehicles.removeIf(vehicle -> vehicle.getId()==(target_id));
        return vehicles;
    }
    @GetMapping("change-price/{target_id}/{new_price}")
    public List<Vehicle> changePrice(@PathVariable int target_id, @PathVariable int new_price) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == target_id) {
                vehicle.setPrice(new_price);
                break;
            }
        }
        return vehicles;
    }
    @GetMapping("discount-all/{percentage}")
    public List<Vehicle> discountPrice(@PathVariable int percentage) {
        if (percentage >=0 && percentage <= 100) {
            for (Vehicle vehicle : vehicles) {
                int oldPrice = vehicle.getPrice();
                int newPrice = oldPrice * (100 - percentage) / 100;
                vehicle.setPrice(newPrice);
            }
        }
        return vehicles;
    }
    /*
    @GetMapping("activate-all/{activity}") // activate-all/true; false
    public List<Vehicle> activateAll(@PathVariable boolean activity) {
        for (Vehicle vehicle : vehicles) {
            vehicle.setActive(activity);
        }
        return vehicles;
    }
    */
}
