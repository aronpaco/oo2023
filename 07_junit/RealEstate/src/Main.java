public class Main {
    public static void main(String[] args) {
        Garage id1 = new Garage(19, 1980, "Tallinn");
        System.out.println("Price: " + id1.getPrice() +
                ", per square meters: " + id1.getPricePerSquareMeter());
        Apartment id2 = new Apartment(40, 2020, "Tartu");
        System.out.println("Price: " + id2.getPrice() +
                ", per square meters: " + id2.getPricePerSquareMeter());
        Apartment id3 = new Apartment(60, 1995, "Sindi");
        System.out.println("Price: " + id3.getPrice() +
                ", per square meters: " + id3.getPricePerSquareMeter());
        House id4 = new House(120, 1995, "Tallinn");
        System.out.println("Price: " + id4.getPrice() +
                ", per square meters: " + id4.getPricePerSquareMeter());
        House id5 = new House(115, 2015, "Tartu");
        System.out.println("Price: " + id5.getPrice() +
                ", per square meters: " + id5.getPricePerSquareMeter());
    }
}