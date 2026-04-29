package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {


  static void main(String[] args) {
    System.out.println("[프로그램 시작]\n");
    pringLength("ThisIsJava");
    pringLength(null);
    System.out.println("[프로그램 종료]");
  }

  private static void pringLength(String data) {
    try {
      int result = data.length();
      System.out.println("문자 수: " + result);
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("[마무리 실행]\n ");
    }

  }
}
