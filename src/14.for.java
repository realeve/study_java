class ForDemo {
  public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
      System.out.println("count is :" + i);
    }
  }
}

// We recommend using this form of the for statement instead of the general form
// whenever possible.
class EnhancedForDemo {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int item : numbers) {
      System.out.println("count is :" + item);
    }
  }
}