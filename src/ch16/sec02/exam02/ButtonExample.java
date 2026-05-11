package ch16.sec02.exam02;

public class ButtonExample {
  static void main(String[] args) {
    Button btnOk = new Button();
    btnOk.setClickListener(() -> System.out.println("Ok 버튼이 클릭되었습니다."));

    btnOk.click();

    Button btnCancel = new Button();
    btnCancel.setClickListener(() -> System.out.println("Cancel 버튼이 클릭되었습니다."));

    btnCancel.click();
  }
}
