//Open/Closed Principle not followed (open for extention, closed for modification).
public class InvoiceDAO {
  Invoice invoice;

  public InvoiceDAO(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToDB() {
    System.out.println("Invoice saved to the Database");
  }

  // modified later
  public void saveToFile() {
    System.out.println("Invoice saved to File");
  }
}