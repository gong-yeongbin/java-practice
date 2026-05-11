package ch16.sec01;

public class LamdaExample {
  static void main(String[] args) {
    action((x, y) -> {
      int result = x + y;
      System.out.println("result: " + result);
    });

    action((x, y) -> {
      int result = x - y;
      System.out.println("result: " + result);
    });
  }

  public static void action(Calculate calculate) {
    int x = 10;
    int y = 4;
    calculate.calculate(x, y);
  }
}
