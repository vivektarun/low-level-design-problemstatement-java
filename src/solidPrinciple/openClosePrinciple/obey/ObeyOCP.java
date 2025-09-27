package solidPrinciple.openClosePrinciple.obey;

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

//Good: following ocp using interfaces and polymorphism
interface InvoiceDao {
    public void save();
}

class DatabseInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public DatabseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving data into db");
    }
}

class FileInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving data into file");
    }
}

class MongoInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public MongoInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving data into mongodb");
    }
}

public class ObeyOCP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2000), 10);
        invoice.calculateTotal();

        InvoiceDao databaseInvoiceDao = new DatabseInvoiceDao(invoice);
        databaseInvoiceDao.save();

        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save();

        InvoiceDao mongoInvoiceDao = new MongoInvoiceDao(invoice);
        mongoInvoiceDao.save();
    }
}
