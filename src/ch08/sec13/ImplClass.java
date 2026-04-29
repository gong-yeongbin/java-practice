package ch08.sec13;

public class ImplClass implements InterfaceC {
  @Override
  public void methodA() {
    System.out.println("ImplClass::methodA 실행");
  }

  @Override
  public void methodB() {
    System.out.println("ImplClass::methodB 실행");
  }

  @Override
  public void methodC() {
    System.out.println("ImplClass::methodC 실행");
  }
}
