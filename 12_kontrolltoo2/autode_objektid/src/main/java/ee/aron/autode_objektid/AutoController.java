package ee.aron.autode_objektid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AutoController {
    @Autowired
    AutoRepository autoRepository;

    // GET  localhost:8080
    @GetMapping("autos")
    public List<Auto> getAutos() {
        return autoRepository.findAll();
    }

    // DELETE   localhost:8080/delete-auto/1
    @DeleteMapping("delete-auto/{id}")
    public String deleteAuto(@PathVariable int id) {
        //    tooted.remove(index);
        autoRepository.deleteById(id);
        return "Automobile deleted!";
    }

    // POST localhost:8080/add-auto?id=1&brand=Toyota&length=200&mass=1500
    @PutMapping("add-auto")
    public List<Auto> addAuto(
            @RequestParam int id,
            @RequestParam String brand,
            @RequestParam int length,
            @RequestParam int mass,
            @RequestParam(required = false) Owner owner) {
        if (mass >= 3500) {
            throw new RuntimeException("Car too heavy");
        } else {
            autoRepository.save(new Auto(id, brand, length, mass, owner));
            return autoRepository.findAll();
        }
    }

    @GetMapping("autos-by-brand")
    public List<Auto> getAutosByBrand(
            @RequestParam String brand) {
        return autoRepository.findAllByBrand(brand);
    }

    // GET /autos-by-length/100/200
    @GetMapping("autos-by-length/{length1}/{length2}")
    public List<Auto> getAutosByLengthRange(
            @PathVariable int length1,
            @PathVariable int length2) {
        return autoRepository.findAllByLengthBetween(length1, length2);
    }

    // GET /autos-by-mass/100/200
    @GetMapping("autos-by-mass/{mass1}/{mass2}")
    public List<Auto> getAutosByMassRange(
            @PathVariable int mass1,
            @PathVariable int mass2) {
        return autoRepository.findAllByMassBetween(mass1, mass2);
    }

    @GetMapping("autos-by-owner/{ownerName}")
    public List<Auto> getAutosByOwner(
            @RequestParam String name, @PathVariable String ownerName) {
        AutoRepository autoRepository1 = autoRepository;
        return autoRepository1.findAllByOwner(name);
    }
}

/*
localhost:8080/add-auto?id=1&brand=Toyota&length=200&mass=1500
localhost:8080/add-owner?id=1&name=John&autos=1
 */
