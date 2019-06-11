class CompareDemo {
  public static void main(String[] args) {
    int val = 1;
    int val2 = 2;
    if (val == val2) {
      System.out.println("val1 == val2");
    } else if (val > val2) {
      System.out.println("val1 > val2");
    } else {
      System.out.println("val1 < val2");
    }

    if (val == 1 && val2 == 2) {
      System.out.println("val1 is 1 and val2 is 2");
    }

    if (val == 1 || val2 == 2) {
      System.out.println("val is 1 or val2 is 1");
    }

    int result;
    boolean bCondition = true;
    result = bCondition ? val : val2;
    System.out.println(result);
  }
}

class Parent {
};

class Child extends Parent implements MyInterface {
};

interface MyInterface {
};

class InstanseofDemo {
  public static void main(String[] args) {
    Parent obj1 = new Parent();
    Parent obj2 = new Child();
    System.out.println(obj1 instanceof Parent);
    System.out.println(obj1 instanceof Child);
    System.out.println(obj2 instanceof Parent);
    System.out.println(obj2 instanceof Child);

    System.out.println(obj2 instanceof MyInterface);
  }
}
