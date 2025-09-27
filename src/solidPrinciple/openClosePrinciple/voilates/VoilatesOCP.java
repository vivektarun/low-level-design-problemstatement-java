package solidPrinciple.openClosePrinciple.voilates;

class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

class Invoice {
    private final Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        this.total = this.marker.price * quantity;
    }
}

class InvoiceDaoOld {
    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("saving to Db...");
    }
}

//Here if any new feature comes we have change this class
//This violates the ocp
class  InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToSequalDb() {
        System.out.println("saving data into db");
    }

    public  void saveToFile() {
        System.out.println("Saving data into file");
    }

    public void saveToMongo() {
        System.out.println("Saving data into mongo");
    }
}

public class VoilatesOCP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2000), 10);

        InvoiceDao dataBaseFileSave = new InvoiceDao(invoice);
        dataBaseFileSave.saveToFile();
        //This is not good practice.

    }
}
