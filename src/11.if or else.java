class IfElseDemo {
  static int applyBrakes(boolean isMoving, int currentSpeed) {
    if (isMoving) {
      currentSpeed--;
    } else {
      System.out.println("the bicycle has already stopped!");
    }
    return currentSpeed;
  }

  public static void main(String[] args) {
    int curSpeed = applyBrakes(true, 4);
    System.out.println(curSpeed);
    applyBrakes(false, 4);
  }

}