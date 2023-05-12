package ee.aron.proovikt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToitController {
    @Autowired
    ToitRepository toitRepository;

    // localhost:8080/toidu-valgud?nimetus=voileib
    @GetMapping("toidu-valgud")
    public int toiduValgud(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int valk = 0;
        for (Toidukomponent t: toidukomponendid) {
            valk += t.getToiduaine().getValk() * t.getKogus() / 100;
        }
        return valk;
    }

    // localhost:8080/toidu-valgud?nimetus=voileib
    @GetMapping("saa-toiduained")
    public List<Toiduaine> saaToiduained(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toiduained = toit.getToidukomponendid();
        return new ArrayList<>();
    }

}
