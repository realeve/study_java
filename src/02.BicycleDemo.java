class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newVal) {
    cadence = newVal;
  }

  void changeGear(int newVal) {
    gear = newVal;
  }

  void speedUp(int inc) {
    speed += inc;
  }

  void speedDown(int dec) {
    speed -= dec;
  }

  void printStates() {
    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
  }

}

class BycicleDemo {

  public static void main(String[] args) {
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);
    bike2.printStates();
  }
}