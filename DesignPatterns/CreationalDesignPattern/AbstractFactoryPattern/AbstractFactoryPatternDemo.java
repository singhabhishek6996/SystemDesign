public class AbstractFactoryPatternDemo {
    public static void main(String [] args){
        //factory producer => gives VehicleFactory object on basis of some input.
        VehicleFactoryProducer vehicleFactoryProducer = new VehicleFactoryProducer();

        //vehicle factory => gives vehicle object on basis of input.
        VehicleFactory vehicleFactory = vehicleFactoryProducer.getVehicleFactory("fast");

        Vehicle vehicle = vehicleFactory.getVehicle("Expensive");
        vehicle.average();

        vehicle = vehicleFactory.getVehicle("CHEAP");
        vehicle.average();

        //vehicle factory => gives vehicle object on basis of input.
        vehicleFactory = vehicleFactoryProducer.getVehicleFactory("slow");

        vehicle = vehicleFactory.getVehicle("Expensive");
        vehicle.average();

        vehicle = vehicleFactory.getVehicle("Cheap");
        vehicle.average();

    }
}
