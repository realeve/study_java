class BreakDemo {
  public static void main(String[] args) {
    int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 20000, 8, 672, 127 };
    int searchfor = 12;

    int i;
    boolean foundIt = false;
    for (i = 0; i < arrayOfInts.length; i++) {
      if (arrayOfInts[i] == searchfor) {
        foundIt = true;
        break;
      }
    }

    if (foundIt) {
      System.out.println("found " + searchfor + " at index " + i);
    } else {
      System.out.println(searchfor + " not in the array");
    }
  }
}

class BreakWithLabelDemo {
  public static void main(String[] args) {
    int[][] arrayOfInts = { { 32, 87, 3, 44 }, { 12, 222, 00, 8 }, { 62, 127, 88, 998 } };

    int searchfor = 12;
    int i;
    int j = 0;
    boolean foundIt = false;

    search: for (i = 0; i < arrayOfInts.length; i++) {
      for (j = 0; j < arrayOfInts[i].length; j++) {
        if (arrayOfInts[i][j] == searchfor) {
          foundIt = true;
          break search;
        }
      }
    }

    if (foundIt) {
      System.out.println("found " + searchfor + " at " + i + "," + j);
    } else {
      System.out.println("not found");
    }

  }
}

class ContinueDemo {
  public static void main(String[] args) {
    String searchMe = "peter piper picked a " + "peck of pickled peppers";
    int max = searchMe.length();
    int iPs = 0;
    for (int i = 0; i < max; i++) {
      if (searchMe.charAt(i) != 'p') {
        continue;
      }
      iPs++;
    }
    System.out.println("found " + iPs + " p's in the string");
  }
}