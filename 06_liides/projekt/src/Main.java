public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IsikukoodEE ee1 = new IsikukoodEE("Mihkel", "50204040111");
        System.out.println(ee1.getSugu() + ee1.getVanus() + " " + ee1.getKuupaev());
        IsikukoodEE ee2 = new IsikukoodEE("Mihkel", "30303039914");
        System.out.println(ee2.getSugu() + ee2.getVanus());
        IsikukoodEE ee3 = new IsikukoodEE("Mihkel", "70303039816");
        System.out.println(ee3.getSugu() + ee3.getVanus());
        IsikukoodEE ee4 = new IsikukoodEE("Mihkel", "50701019992");
        System.out.println(ee4.getSugu() + ee4.getVanus());
        IsikukoodEE ee5 = new IsikukoodEE("Mihkel", "40404049996");
        System.out.println(ee5.getSugu() + ee5.getVanus());

        System.out.println(); // FI
        IsikukoodFI fi1 = new IsikukoodFI("Miikael", "111111-111C");
        System.out.println(fi1.getSugu() + fi1.getVanus() + " " + fi1.getKuupaev());
        IsikukoodFI fi2 = new IsikukoodFI("Miikael", "010101-0101");
        System.out.println(fi2.getSugu() + fi2.getVanus() + " " + fi2.getKuupaev());
        IsikukoodFI fi3 = new IsikukoodFI("Miikael", "010101A900R");
        System.out.println(fi3.getSugu() + fi3.getVanus() + " " + fi3.getKuupaev());
        IsikukoodFI fi4 = new IsikukoodFI("Miikael", "010101-0102");
        System.out.println(fi4.getSugu() + fi4.getVanus() + " " + fi4.getKuupaev());
        IsikukoodFI fi5 = new IsikukoodFI("Miikael", "111111-111Q");
        System.out.println(fi5.getSugu() + fi5.getVanus() + " " + fi5.getKuupaev());
    }
}