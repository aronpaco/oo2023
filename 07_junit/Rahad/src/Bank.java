public class Bank extends Assets implements Calculations {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

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
