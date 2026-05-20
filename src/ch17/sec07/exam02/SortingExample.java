package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
  static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("홍길동", 30));
    studentList.add(new Student("신용권", 20));
    studentList.add(new Student("유미선", 10));

    studentList.stream().sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore())).forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    System.out.println();

    studentList.stream().sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore())).forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
  }
}
