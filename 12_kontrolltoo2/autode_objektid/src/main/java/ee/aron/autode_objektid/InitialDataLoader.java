/*
package ee.aron.autode_objektid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class InitialDataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final AutoRepository autoRepository;

    public InitialDataLoader(OwnerRepository ownerRepository, AutoRepository autoRepository) {
        this.ownerRepository = ownerRepository;
        this.autoRepository = autoRepository;
    }

    @Override
    public void run(String... args) {
        if (ownerRepository.count() == 0) {
            // Create and save initial owners
            Owner owner1 = new Owner(1, "John", new ArrayList<>());
            Owner owner2 = new Owner(2, "Alice", new ArrayList<>());
            Owner owner3 = new Owner(3, "Bob", new ArrayList<>());

            ownerRepository.saveAll(Arrays.asList(owner1, owner2, owner3));

            // Create and save initial cars
            Auto car1 = new Auto(1, "Toyota", 200, 1500);
            Auto car2 = new Auto(2, "Ford", 180, 1400);
            Auto car3 = new Auto(3, "Honda", 190, 1550);
            Auto car4 = new Auto(4, "BMW", 210, 1650);
            Auto car5 = new Auto(5, "Mercedes", 220, 1700);

            autoRepository.saveAll(Arrays.asList(car1, car2, car3, car4, car5));

            // Add cars to the owners
            owner1.getAutos().addAll(Arrays.asList(car1, car2));
            owner2.getAutos().addAll(Arrays.asList(car3));
            owner3.getAutos().addAll(Arrays.asList(car4, car5));

            ownerRepository.saveAll(Arrays.asList(owner1, owner2, owner3));
        }
    }
}
*/