//does not follow Interface Segmented Principle.
public class Waiter implements RestaurantEmployee {

    //Waiter does not need this function.
    @Override
    public void washDishes() {
        //not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving...");
    }

    //Waiter does not need this function.
    @Override
    public void cookFood() {
        //not my job
    }
}
