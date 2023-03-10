public class Main {

        public static void main(String[] args) {
// äge tabel
            int numberOfRows = 5;
            int numberOfColumns = 10;
            int columns = 1;
            int rows = 1;
            while (columns < numberOfColumns) {
                System.out.print(columns);
                columns = columns + 1;
            }
            System.out.println();
            while (rows < numberOfRows) {
                System.out.println(rows + 1);
                rows = rows + 1;
            }
            System.out.println();
// astendamine
            int astendatav = 5;
            int astendaja = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println(Math.pow(astendatav, astendaja));
                astendaja = astendaja + 1;
            }
            System.out.println();
// AM / PM
            String hour = kellHour(8);
            String hour2 = kellHour(20);
            System.out.println(hour);
            System.out.println(hour2);
        }
    private static String kellHour(double kell) {
        return kell < 12 ? "AM" : "PM";
    }
}