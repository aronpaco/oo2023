import java.util.Date;

public class Purchase {
    Buyer buyer;
    Double price;
    String paymentType;
    //Date purchaseDate;


    public Purchase(Buyer buyer, Double price, String paymentType) {
        this.buyer = buyer;
        this.price = price;
        this.paymentType = paymentType;
    }

    public void discount(int discountPercent) {
        this.price = this.price - this.price * discountPercent / 100;
    }

}
