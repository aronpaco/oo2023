import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTestimine {

    @Test
    public void kontrolli_kolmnurga_ymbermoot() {
        Kolmnurk kolmnurk = new Kolmnurk(3,6,7,8);
        assertEquals(21.099, kolmnurk.arvutaYmbermoot(), 0.1);
    }
}

// minimaalne 6 testi
// 2 * 3 = 6