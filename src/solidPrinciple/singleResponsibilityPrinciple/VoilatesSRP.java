package solidPrinciple.singleResponsibilityPrinciple;

class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker (String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //Responsibility 1: calculate the total price(business logic)
    public void calculateTotal() {
        this.total = this.marker.price * this.quantity;
    }

    //Responsibility 2: Database Operations
    public void saveToDB() {
        //save to the database.
        System.out.println("Saving data into db.");
    }

    //Responsibility 3: print the invoice
    public void printInvoice() {
        System.out.println("printing the invoice");
    }
}

public class VoilatesSRP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2000), 20);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}
