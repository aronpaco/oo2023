public class Cash extends Assets implements Calculations {
    double balance = 50;

    @Override
    public double calculateAssets() {
        return balance;
    }

    @Override
    public double calculateLiabilities() {
        return 0;
    }

    @Override
    public double calculateNetWorth() {
        return 0;
    }
}
