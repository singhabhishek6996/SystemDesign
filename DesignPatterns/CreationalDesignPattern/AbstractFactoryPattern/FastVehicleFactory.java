public class FastVehicleFactory implements  VehicleFactory{
    @Override
    public Vehicle getVehicle(String input){
        if(input.equalsIgnoreCase("EXPENSIVE")){
            return new Sports();
        }
        else if(input.equalsIgnoreCase("CHEAP")){
            return new Premium();
        }
        return null;
    }
}
