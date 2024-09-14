public class InvoiceDAO2 {
  InvoiceSRP invoice;

  public InvoiceDAO2(InvoiceSRP invoice) {
    this.invoice = invoice;
  }

  // Responsibility 3
  public void saveToDB() {
    System.out.println("Invoice saved to the Database");
  }
}