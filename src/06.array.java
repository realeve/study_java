// [https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

class ArrayDemo {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[10];

    arr[0] = 100;
    arr[1] = 100;
    arr[8] = 8_33_32_45;
    arr[9] = 900;

    System.out.println("arr0:" + arr[0]);
    System.out.println("arr1:" + arr[1]);
    System.out.println("arr3:" + arr[3]);
    System.out.println("arr8:" + arr[8]);
    System.out.println("arr9:" + arr[9]);

    int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("arr0:" + arr2[0]);
  }
}

// 多维数组
class MultiDimArrayDemo {
  public static void main(String[] args) {
    String[][] names = { { "0", "1", "2" }, { "3", "4", "5" } };

    System.out.println(names[1][2]);

    System.out.println(names.length);

    char[] charSrc = { 'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'd' };

    char[] charDest = new char[charSrc.length];

    System.arraycopy(charSrc, 2, charDest, 2, 3);

    System.out.println(new String(charDest));

    char[] charCopyTo = java.util.Arrays.copyOfRange(charSrc, 0, charSrc.length);
    System.out.println(new String(charCopyTo));
  }
}