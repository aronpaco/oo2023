import org.junit.Test;
import static org.junit.Assert.assertEquals; // see tuleb asja imporditud kaustast

public class AutomaatTest {

    // Add JUnit4 to classpath > ok > ok
    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("Martiine", "40404049996");
        assertEquals("F", ee.getSugu());
    }
    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_7() {
        IsikukoodEE ee = new IsikukoodEE("Martiine", "70303039816");
        assertEquals("Vigane isikukood", ee.getSugu());
    }
    @Test
    public void kontrolli_kas_kuupaev_on_04_04_2002() {
        IsikukoodEE ee = new IsikukoodEE("Martiine", "50204049816");
        assertEquals("04.04.2002", ee.getKuupaev());
    }
    @Test
    public void kontrolli_kas_kuupaev_on_01_01_01() {
        IsikukoodFI fi = new IsikukoodFI("Martiine", "010101-0101");
        assertEquals("01.01.1901", fi.getKuupaev());
    }

}
