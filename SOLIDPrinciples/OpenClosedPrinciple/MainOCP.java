public class MainOCP {
  public static void main(String[] args) {
    DatabaseInvoiceDAO databaseInvoiceDAO = new DatabaseInvoiceDAO();
    databaseInvoiceDAO.save();

    FileInvoiceDAO fileInvoiceDAO = new FileInvoiceDAO();
    fileInvoiceDAO.save();
  }
}
