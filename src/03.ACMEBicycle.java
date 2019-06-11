
interface IBicycle {
  void changeCadence(int v);

  void changeGear(int v);

  void speedUp(int inc);

  void applyBrakes(int dec);

  void printStates();
}

class ACMEBicycle implements IBicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  public void changeCadence(int v) {
    cadence = v;
  }

  public void changeGear(int v) {
    gear = v;
  }

  public void speedUp(int inc) {
    speed += inc;
  }

  public void applyBrakes(int dec) {
    speed -= dec;
  }

  public void printStates() {
    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
  }

}

class ACMEBicycleDemo {
  public static void main(String[] args) {
    ACMEBicycle bicycle = new ACMEBicycle();
    bicycle.changeCadence(3);
    bicycle.changeGear(5);
    bicycle.speedUp(12);
    bicycle.applyBrakes(1);
    bicycle.printStates();
  }
}