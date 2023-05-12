package ee.aron.autode_objektid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {
    @Autowired
    OwnerRepository ownerRepository;

    // GET  localhost:8080
    @GetMapping("owners")
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    // DELETE   localhost:8080/delete-owner/1
    @DeleteMapping("delete-owner/{id}")
    public String deleteOwner(@PathVariable int id) {
        //    tooted.remove(index);
        ownerRepository.deleteById(id);
        return "Owner deleted!";
    }

    // POST localhost:8080/add-owner?id=1&name=John&autos=1
    @PutMapping("add-owner")
    public List<Owner> addOwner(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam(required = false) List<Auto> autos) {
        Owner owner = new Owner(id, name, autos);
        ownerRepository.save(owner);
        return ownerRepository.findAll();
    }


}
