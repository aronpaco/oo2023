public class Monitor {
    String brand;
    int diagonal;
    double widthPixels;
    double heightPixels;
    double aspectRatio = widthPixels / heightPixels;
    double wide = 16.0/9.0;
    double ultraWide = 21.0/9.0;

    public Monitor(String brand, int diagonal, double widthPixels, double heightPixels) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public void setAspectRatio() {
        if(this.aspectRatio == wide) {
            isWide();
        }
        if(this.aspectRatio == ultraWide) {
            isUltraWide();
        }
    }
    private void isWide() {
        System.out.println("Wide, 16:9 ratio");
    }
    private void isUltraWide() {
        System.out.println("Ultrawide, 21:9 ratio");
    }

    public void setDiagonal() {
        if(this.diagonal > 25) {
            bigMonitor();
        }
    }
    private void bigMonitor() {
        System.out.println("The monitor is big");
    }
}
