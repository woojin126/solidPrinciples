package OpenClosePrinciple;

public class DatabasePersistence implements InvoicePersistence{

    @Override
    public void save(Invoice invoice) {
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
        System.out.println("데이터베이스 저장");
    }
}
