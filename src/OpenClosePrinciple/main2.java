package OpenClosePrinciple;

public class main2 {

    public static void main(String[] args) {
        Book book = new Book("esfsef", "efesf", 2222, 10000, "1231");
        Invoice invoice = new Invoice(book, 10, 10000, 10);

        InvoicePersistence databasePersistence = new DatabasePersistence();
        databasePersistence.save(invoice);
        InvoicePersistence filePersistence = new FilePersistence();
        filePersistence.save(invoice);


    }
}
