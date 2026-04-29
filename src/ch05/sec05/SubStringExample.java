package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";

        String firstNum = ssn.substring(0, 6);
        System.out.println("주민등록번호 앞자리: " + firstNum);
        
        String secondNum = ssn.substring(7);
        System.out.println("주민등록번호 뒷자리: " + secondNum);
    }
}
