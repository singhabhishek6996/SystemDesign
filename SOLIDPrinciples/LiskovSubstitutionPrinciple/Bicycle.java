public class Bicycle implements Bike {
  private boolean isEngineOn;
  private int speed;

  public Bicycle(boolean isEngineOn, int speed) {
    this.isEngineOn = isEngineOn;
    this.speed = speed;
  }

  @Override
  public void turnOnEngine() {
    throw new AssertionError("No Engine Found");
  }

  @Override
  public int acclerate() {
    speed += 5;
    return speed;
  }
}
