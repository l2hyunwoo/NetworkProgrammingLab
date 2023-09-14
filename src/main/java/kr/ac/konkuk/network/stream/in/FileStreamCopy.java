package kr.ac.konkuk.network.stream.in;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("/Users/hyunwoo/IdeaProjects/networklab/src/main/java/kr/ac/konkuk/network/stream/in/SystemInReadTest.java");
            fos = new FileOutputStream("/Users/hyunwoo/IdeaProjects/networklab/src/main/java/kr/ac/konkuk/network/stream/in/SystemInReadTest2.java");
            int readCount = 0;
            byte[] buffer = new byte[1024];

            while((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }
            System.out.println("복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
