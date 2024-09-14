public class MainLSP {
  public static void main(String[] args) {
    Bike bike = new Car(false, 0);
    int speed = bike.acclerate();
    System.out.println(speed);
    bike.turnOnEngine();

    bike = new Bicycle(false, 0);
    int speed2 = bike.acclerate();
    System.out.println(speed2);
    bike.turnOnEngine();// breaks the behaviour of Bike class.

    // Object of superclass can be replaced with object of subclass without
    // breaking.
    // Subclass should extend the capability of parent and not narrow it down.
  }
}
