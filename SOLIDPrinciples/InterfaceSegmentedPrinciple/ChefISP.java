public class ChefISP implements ChefInterface{

    @Override
    public void cookFood(){
        System.out.println("Cooking...");
    }

    @Override
    public void decideMenu(){
        System.out.print("Deciding Menu...");
    }
}
