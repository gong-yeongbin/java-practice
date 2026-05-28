package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
  static void main(String[] args) {
    try {
      OutputStream os = new FileOutputStream("/Users/gong-yeongbin/IdeaProjects/this-is-java/src/ch18/sec02/exam02/test1.db");

      byte[] array = {10, 20, 30};

      os.write(array);

      os.flush();
      os.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
