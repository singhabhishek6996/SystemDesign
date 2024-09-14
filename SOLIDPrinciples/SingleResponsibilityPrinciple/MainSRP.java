public class MainSRP {
  public static void main(String[] args) {

    Marker2 marker2 = new Marker2("Cello", "Red", 10, 2004);

    // without using SRP
    Invoice invoice = new Invoice(marker2, 10);
    int price = invoice.calculateTotal();
    System.out.println(price);
    invoice.printInvoice();
    invoice.saveToDB();

    // using SRP
    InvoiceSRP invoice2 = new InvoiceSRP(marker2, 20);
    int price2 = invoice2.calculateTotal();
    System.out.println(price2);
    InvoiceDAO2 invoiceDAO2 = new InvoiceDAO2(invoice2);
    invoiceDAO2.saveToDB();
    InvoicePrinter invoicePrinter = new InvoicePrinter(invoice2);
    invoicePrinter.printInvoice();
  }
}
