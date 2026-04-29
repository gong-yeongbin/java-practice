package ch11.sec05;

public class ThrowsExample1 {
  static void main(String[] args) {
    try {
      firstClass();
    } catch (Exception e) {
      System.out.println("예외 처리: " + e.getMessage());
    }
  }

  public static void firstClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
  }
}
