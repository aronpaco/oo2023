import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine {
    // double[] arvudListis; // pärisarvud
    List<Double> arvudListis = new ArrayList<>();
    // double[] arvudKeskmisega; // salvestuse eesmärgil kõik keskmised panen kirja
    List<Double> arvudKeskmisega = new ArrayList<>();
    int lisatudArvudeArv;
    public LibisevKeskmine(double n1, double n2, double n3) {
    //    arvudListis = new double[3];
     //   arvudListis[0] = n1;
    //    arvudListis[1] = n2;
     //   arvudListis[2] = n3;
        arvudListis.add(n1);
        arvudListis.add(n2);
        arvudListis.add(n3);
    }
    public void lisaArv(double n) {
        arvudListis.add(n);
//        private static double[] libisevKeskmine(double[] arvud) {
//            double[] valjund = new double[arvud.length-2];  // kui teen uue array, pean koheselt ytlema, kui pikk ta on
//            for (int i = 0; i < arvud.length-2; i++) {
//                valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3.0;
//            }
//            return valjund;
    }
}
