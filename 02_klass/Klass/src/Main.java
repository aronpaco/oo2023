import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kasutaja mihkel = new Kasutaja("mihkel",
                "mihkel",
                "mihkel",
                "mihkel",
                "mihkel");
        Kasutaja mihkel2 = new Kasutaja("mihkel",
                "mihkel",
                "mihkel",
                "mihkel",
                "mihkel");

        mihkel.kustutaKasutaja();

        mihkel2.muudaParool("mihkelmihekl");

        Tellimus tellimus1 = new Tellimus("Mihkel", Arrays.asList("Coca", "Fanta"));
        Tellimus tellimus2 = new Tellimus("Mihkel", Arrays.asList("Coca", "Fanta"));

        tellimus1.muudaMakstuks();
        tellimus2.kasOnMakstud();
    }
}