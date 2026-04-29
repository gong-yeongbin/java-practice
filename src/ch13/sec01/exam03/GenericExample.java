package ch13.sec01.exam03;

public class GenericExample {
  static void main(String[] args) {
    Box<String> box1 = new Box<>();
    box1.content = "100";

    Box<String> box2 = new Box<>();
    box2.content = "100";

    boolean result = box1.compare(box2);
    System.out.println("result1: " + result);
  }
}
