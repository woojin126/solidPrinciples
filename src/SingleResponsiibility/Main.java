package SingleResponsiibility;
class Book {
    String name;
    String authorName;
    int year;
    int price;
    String isbn;

    public Book(String name, String authorName, int year, int price, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }
}
class Invoice {

    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        //할인된 책가격 X 수량
        double price = ((book.price - book.price * discountRate) * this.quantity);
        //세율
        double priceWithTaxes = price * ( 1 + taxRate );

        return priceWithTaxes;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }
}
class InvoicePrinter {
    private final Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().name + " " + invoice.getBook().price + " $");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal() + " $");
    }
}

class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}

public class Main {

    public static void main(String[] args) {
        Book book = new Book("클린코드", "로버트마틴", 2022, 10000, "ㄹㄷㄹㄷㄹ");
        Invoice invoice = new Invoice(book, 10, 100, 10 );
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();

    }
}
