//does not follow Interface Segmented Principle.
public class Chef implements RestaurantEmployee{
    @Override
    public void washDishes() {
        System.out.println("Washing...");
    }

    //Chef does not need this function.
    @Override
    public void serveCustomers() {
        //not my job
    }

    @Override
    public void cookFood() {
        System.out.print("Cooking...");
    }
}
