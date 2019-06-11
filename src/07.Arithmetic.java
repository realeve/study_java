// 自增自增符号的顺序，与C语言一致
class PrePostDemo {
  public static void main(String[] args) {
    int i = 3;
    System.out.println(i++);
    System.out.println(++i);
    System.out.println(i);
    System.out.println(--i);
    System.out.println(i);
    System.out.println(i++);
    System.out.println(i);
  }
}