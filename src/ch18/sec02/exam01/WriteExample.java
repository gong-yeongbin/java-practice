package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
  static void main(String[] args) {
    try {
      OutputStream os = new FileOutputStream("/Users/gong-yeongbin/IdeaProjects/this-is-java/src/ch18/sec02/exam01/test1.db");

      byte a = 10;
      byte b = 20;
      byte c = 30;

      os.write(a);
      os.write(b);
      os.write(c);

      os.flush();
      os.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
