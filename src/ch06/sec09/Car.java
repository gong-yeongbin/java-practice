package ch06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println("자동차가 달립니다. (모델: " + this.model + ", 속도: " + this.speed + "km/h)");
    }
}
