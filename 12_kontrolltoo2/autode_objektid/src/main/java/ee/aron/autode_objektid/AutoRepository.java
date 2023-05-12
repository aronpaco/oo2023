package ee.aron.autode_objektid;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Integer> {
    List<Auto> findAllByBrand (String brand);
    List<Auto> findAllByLengthBetween (int length1, int length2);
    List<Auto> findAllByMassBetween (int mass1, int mass2);

}
