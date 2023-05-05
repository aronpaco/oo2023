package ee.aron.proovikt;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toidukomponent {
    @Id
    private Long id;

    @ManyToOne
    private Toiduaine toiduaine;
    private int kogus;

    // isik1 ja kontaktandmed1
    // isik2 ja kontaktandmed2

    //isik1 kontaktandmed1
    //isik2 kontaktandmed

}
