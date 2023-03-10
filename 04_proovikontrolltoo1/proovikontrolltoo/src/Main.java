import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Libisev keskmine
public class Main {
    public static void main(String[] args) {
        double arv1 = 4;
        double arv2 = 7;
        double arv3 = 9;
        double aritmeetilineKeskmine = (arv1 + arv2 + arv3) / 3;
        System.out.println(aritmeetilineKeskmine);

        System.out.println(aritmeetilineKeskmine2(111,234,398));

        double[] sisend = {3,4,5,6,6}; // [3,4,5,6,6]
        // List<Double> sisend = new ArrayList(Arrays.asList(3,4,5,6,6));
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));
    }
    private static double aritmeetilineKeskmine2(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    private static double[] libisevKeskmine(double[] arvud) {
        double[] valjund = new double[arvud.length-2];  // kui teen uue array, pean koheselt ytlema, kui pikk ta on
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3.0;
        }
        return valjund;
    }

    // List numbriteList = new ArrayList();  // manipuleeritav (1 juurde, 1 vähemaks, järjekorda)
    // numbriteList[];  // read-only
}