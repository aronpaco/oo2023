import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        int sum = 0;
        try (FileWriter writer = new FileWriter("keskmised_kiirused.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
            float averageSpeed = 0;
            try {
                BufferedReader brf = new BufferedReader(new FileReader(new File("kiirused.txt")));
                String line;
                int count = 0;
                while ((line = brf.readLine()) != null) {
                    sum += Integer.parseInt(line);
                    count++;
                }
                averageSpeed = sum / count;
                System.out.println("Keskmine kiirus on " + averageSpeed);
            } catch (IOException | NumberFormatException exception) {
                System.out.println(exception.getMessage());
            }
            bw.write((int) averageSpeed);
            System.out.println(averageSpeed);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
