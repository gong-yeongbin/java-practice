package ch08.sec09;

public class ExtendsExample {
  public static void main(String[] args) {
    InterfaceCImpl impl = new InterfaceCImpl();

    InterfaceA implA = impl;
    implA.methodA();
//    implA.methodB();
    System.out.println();

    InterfaceB implB = impl;
    implB.methodB();
//    implB.methodA();
    System.out.println();

    InterfaceC implC = impl;
    implC.methodA();
    implC.methodB();
    implC.methodC();
  }
}
