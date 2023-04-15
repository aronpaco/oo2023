/*
package ee.aron.primitiividkodus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuulutusController {
    Kuulutus kuulutus = new Kuulutus(1, "Koola", 1.5, true);
    Kuulutus kuulutus2 = new Kuulutus(1, "Fanta", 2, true);

    @GetMapping("kuulutus") // localhost:8080/kuulutus
    public Kuulutus saaKuulutus() {
        return kuulutus;
    }
    @GetMapping("kustuta-kuulutus")
    public Kuulutus kustutaKuulutus() {
        kuulutus = null;
        return kuulutus;
    }
    @GetMapping("kustuta-kuulutus1")
    public void kustutaKuulutus1() {
        kuulutus = null;
    }

    @GetMapping("kustuta-kuulutus2")
    public String kustutaKuulutus2() {
        kuulutus = null;
        return "Edukalt kustutatud!";
    }
    @GetMapping("suurenda-hinda")
    public Kuulutus suurendaHinda() {
        kuulutus.setHind( kuulutus.getHind()+1 );
        return kuulutus;
    }
    @GetMapping("muuda-aktiivsust")
    public Kuulutus muudaAktiivsust() {
        kuulutus.setAktiivne(!kuulutus.isAktiivne());
        return kuulutus;
    }
}
*/