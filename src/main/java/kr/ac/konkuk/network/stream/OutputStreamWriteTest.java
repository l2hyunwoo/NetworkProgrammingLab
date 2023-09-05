package kr.ac.konkuk.network.stream;

import java.util.stream.IntStream;

public class OutputStreamWriteTest {
    public static void main(String[] args) {
        IntStream.range(1, 200)
                .forEach((num) -> {
                    System.out.write(num);
                    System.out.print(num);
                    System.out.flush();
                });
    }
}
