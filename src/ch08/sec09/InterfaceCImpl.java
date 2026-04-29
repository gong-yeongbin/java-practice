package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {

  @Override
  public void methodA() {
    System.out.println("IntefaceCImpl.methodA() 실행");
  }

  @Override
  public void methodB() {
    System.out.println("IntefaceCImpl.methodB() 실행");
  }

  @Override
  public void methodC() {
    System.out.println("IntefaceCImpl.methodC() 실행");
  }
}
