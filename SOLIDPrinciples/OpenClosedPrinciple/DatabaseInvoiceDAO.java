public class DatabaseInvoiceDAO implements InvoiceDAOInterface {
  @Override
  public void save() {
    System.out.println("Invoice saved to the Database");
  }
}