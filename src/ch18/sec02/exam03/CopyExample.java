package ch18.sec02.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
  static void main(String[] args) {
    String originalFileName = "/Users/gong-yeongbin/IdeaProjects/this-is-java/src/ch18/sec02/exam03/testing.jpg";
    String targetFileName = "/Users/gong-yeongbin/IdeaProjects/this-is-java/src/ch18/sec02/exam03/testing2.jpg";

    try {
      InputStream is = new FileInputStream(originalFileName);
      OutputStream os = new FileOutputStream(targetFileName);

      byte[] data = new byte[1024];

      while (true) {
        int num = is.read(data);
        if (num == -1) break;
        os.write(data, 0, num);
      }

      os.flush();
      os.close();
      is.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
