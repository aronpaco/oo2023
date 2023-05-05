package ee.aron.primitiividkodus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Listing {
    private int id;
    private Vehicle vehicle;
    private Seller seller;
    private boolean activity;

    public void setActive(boolean activity) {
    }
}
