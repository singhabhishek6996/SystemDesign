//Single Responsibility Principle.
public class InvoiceSRP {
  private Marker2 marker2;
  private int quantity;

  public InvoiceSRP(Marker2 marker2, int quantity) {
    this.marker2 = marker2;
    this.quantity = quantity;
  }

  // Responsibility 1
  public int calculateTotal() {
    int price = ((marker2.price) * this.quantity);
    return price;
  }
}
