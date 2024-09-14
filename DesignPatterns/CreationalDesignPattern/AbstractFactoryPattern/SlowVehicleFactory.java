//grouped on the basis of speed of car slow/fast.
public class SlowVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input){
        if(input.equalsIgnoreCase("EXPENSIVE")){
            return new Luxury();
        }
        else if(input.equalsIgnoreCase("CHEAP")){
            return new Economical();
        }
        return null;
    }
}
