package kr.ac.konkuk.network.stream.in;

import java.io.IOException;

public class SystemInReadTest {
    public static void main(String[] args) {
        int inChar = 0;
        int inChar2 = 0;
        byte[] ch = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        System.out.println("Input: ");
        try {
            int i = 0;
            inChar = System.in.read();
            System.out.println("inChar: " + inChar);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
