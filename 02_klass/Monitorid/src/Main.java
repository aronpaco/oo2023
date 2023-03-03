public class Main {
    public static void main(String[] args) {
        Monitor Samsung_S24D330 = new Monitor("Samsung",
                24, 1920, 1080);
        Monitor LG_29WN600 = new Monitor("LG",
                29, 2560, 1080);
        Monitor uusMonitor = new Monitor("AOC",
                27, 2560, 1440);
        Samsung_S24D330.setAspectRatio();
        Samsung_S24D330.setDiagonal();
        System.out.println();
        LG_29WN600.setAspectRatio();
        LG_29WN600.setDiagonal();
        System.out.println();
        uusMonitor.setDiagonal();

    }
}