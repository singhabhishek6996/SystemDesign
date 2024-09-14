//without Single Responsibility Principle.
public class InvoiceOCP {
  private Marker2 marker2;
  private int quantity;

  public InvoiceOCP(Marker2 marker2, int quantity) {
    this.marker2 = marker2;
    this.quantity = quantity;
  }

  // Responsibility 1
  public int calculateTotal() {
    int price = ((marker2.price) * this.quantity);
    return price;
  }

  // Responsibility 2
  public void printInvoice() {
    System.out.println("Invoice Printed");
  }

  // Responsibility 3
  public void saveToDB() {
    System.out.println("Invoice saved to the Database");
  }
}
