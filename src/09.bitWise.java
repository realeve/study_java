class BitDemo {
  public static void main(String[] args) {
    int bitmask = 0x0F0F;
    int val = 0x2222;
    System.out.println(val & bitmask);
  }
}