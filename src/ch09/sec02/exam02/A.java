package ch09.sec02.exam02;

public class A {
  class B {
    int filed1 = 1;

    static int filed2 = 2;

    B() {
      System.out.println("B 생성자 실행");
    }

    void method1() {
      System.out.println("B 메소드 실행");
    }

    static void method2() {
      System.out.println("B 정적 메소드 실행");
    }
  }

  void useB() {
    B b = new B();
    System.out.println("B 객체의 필드값 : " + b.filed1);
    b.method1();

    System.out.println("B 클래스의 정적 필드값 : " + B.filed2);
    B.method2();
  }
}
