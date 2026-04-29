package ch12.sec11.exam01;

public class Car {
  static void main(String[] args) throws Exception {
//    Class clazz = Car.class;

    Class clazz = Class.forName("ch12.sec11.exam01.Car");

    System.out.println("패키지 : " + clazz.getPackage().getName());
    System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
    System.out.println("클래스 이름 : " + clazz.getName());
  }
}
