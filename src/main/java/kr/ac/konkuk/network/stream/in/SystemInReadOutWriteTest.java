package kr.ac.konkuk.network.stream.in;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemInReadOutWriteTest {
    public static void main(String[] args) {
        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // 키보드로 입력 받음
            // 한 바이트 읽고 input에다 집어넣기
            int input = in.read();
            // input에 있는 값을 출력 (17인 경우 1이 출력되어야겠지?
            // 그런데 49가 출력됨 (??)
            // '1' -> ASCII 코드로 49니까.... 저건 character 하나가 들어간거임...
            System.out.println(input);
            out.write(input);
            out.flush();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
