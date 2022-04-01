package OpenClosePrinciple;

public class FilePersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
        System.out.println("파일저장");
    }
}
