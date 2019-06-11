class SwitchDemo {

  public static void main(String[] args) {

    int month = 5;
    String monthStr;

    switch (month) {
    case 1:
      monthStr = "jan";
      break;
    case 2:
      monthStr = "feb";
      break;
    case 3:
      monthStr = "mar";
      break;
    case 4:
      monthStr = "apr";
      break;
    case 5:
      monthStr = "may";
      break;
    case 6:
    default:
      monthStr = "jun";
      break;
    }
    System.out.println(monthStr);
  }

}