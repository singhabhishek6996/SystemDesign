public class VehicleFactoryProducer {
    public VehicleFactory getVehicleFactory(String input){
        if(input.equalsIgnoreCase("FAST")){
            return new FastVehicleFactory();
        }
        else if(input.equalsIgnoreCase("SLOW")){
            return new SlowVehicleFactory();
        }
        return null;
    }
}
