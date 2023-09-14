package kr.ac.konkuk.network.stream.in;

import java.io.FileInputStream;
import java.io.IOException;

public class FileView {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (var fis = new FileInputStream("/Users/hyunwoo/IdeaProjects/networklab/src/main/java/kr/ac/konkuk/network/stream/in/SystemInReadTest.java")) {
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
