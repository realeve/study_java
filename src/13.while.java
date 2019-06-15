class WhileDemo {
  public static void main(String[] args) {
    int count = 1;
    while (count < 11) {
      System.out.println("count is :" + count);
      count++;
    }
  }
}

class DoWhileDemo {
  public static void main(String[] args) {
    int count = 1;
    do {
      System.out.println("count is :" + count);
      count++;
    } while (count < 11);
  }
}