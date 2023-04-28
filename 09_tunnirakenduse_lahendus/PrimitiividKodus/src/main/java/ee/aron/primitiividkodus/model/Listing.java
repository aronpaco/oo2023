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
    private String brand;
    private String model;
    private int price;
    private boolean active;
}
/*
id
brand
model
year
price
active


 */
