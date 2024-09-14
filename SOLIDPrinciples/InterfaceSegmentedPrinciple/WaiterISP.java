public class WaiterISP implements  WaiterInterface{

    @Override
    public void serveCustomers(){
        System.out.println("Serving...");
    }

    @Override
    public void takeOrder(){
        System.out.println("Taking Orders...");
    }
}
