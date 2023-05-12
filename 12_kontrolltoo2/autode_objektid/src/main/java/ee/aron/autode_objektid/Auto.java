package ee.aron.autode_objektid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Auto {
    @Id
    private int id;
    private String brand;
    private int length;
    private int mass;
    @ManyToOne
    private Owner owner;

    public Auto(int i, String toyota, int i1, int i2) {
    }
}
