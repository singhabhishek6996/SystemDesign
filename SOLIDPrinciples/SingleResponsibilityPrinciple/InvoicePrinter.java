public class InvoicePrinter {
  InvoiceSRP invoice;

  public InvoicePrinter(InvoiceSRP invoice) {
    this.invoice = invoice;
  }

  // Responsibility 2
  public void printInvoice() {
    System.out.println("Invoice Printed");
  }
}