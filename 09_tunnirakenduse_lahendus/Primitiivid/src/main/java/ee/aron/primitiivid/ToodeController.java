package ee.aron.primitiivid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToodeController {
    Toode toode = new Toode(1, "Koola", 1.5, true);
    Toode toode2 = new Toode(1, "Fanta", 2, true);

    @GetMapping("toode") // localhost:8080/toode
    public Toode saaToode() {
        return toode;
    }
    @GetMapping("kustuta-toode")
    public Toode kustutaToode() {
        toode = null;
        return toode;
    }
    @GetMapping("kustuta-toode1")
    public void kustutaToode1() {
        toode = null;
    }

    @GetMapping("kustuta-toode2")
    public String kustutaToode2() {
        toode = null;
        return "Edukalt kustutatud!";
    }
    @GetMapping("suurenda-hinda")
    public Toode suurendaHinda() {
        toode.setHind( toode.getHind()+1 );
        return toode;
    }
    @GetMapping("muuda-aktiivsust")
    public Toode muudaAktiivsust() {
        toode.setAktiivne(!toode.isAktiivne());
        return toode;
    }
}
