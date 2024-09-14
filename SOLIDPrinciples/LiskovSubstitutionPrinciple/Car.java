public class Car implements Bike {
  private boolean isEngineOn;
  private int speed;

  public Car(boolean isEngineOn, int speed) {
    this.isEngineOn = isEngineOn;
    this.speed = speed;
  }

  @Override
  public void turnOnEngine() {
    System.out.println("Turned on Engine");
    isEngineOn = true;
  }

  @Override
  public int acclerate() {
    speed += 10;
    return speed;
  }
}
