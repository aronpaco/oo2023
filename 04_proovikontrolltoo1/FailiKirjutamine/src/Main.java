import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("Terererer");
        pw.print(" Juku kuku");
        pw.print(" lol");
        pw.println("Uus rida");
        pw.print("Nyd on uus rida");
        pw.close();
    }
}