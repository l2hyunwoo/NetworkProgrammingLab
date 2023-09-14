package kr.ac.konkuk.network.stream.out;

import java.io.IOException;

public class GenerateCharacterByArray {
    public static void main(String[] args) {
        try {
            generateCharacters();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    private static void generateCharacters() throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;
        int start = firstPrintableCharacter;
        int count = 0;
        var out = System.out;
        byte[] line = new byte[numberOfCharactersPerLine + 2];

        while (count < 1000) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                line[i - start] = (byte) ((i - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter);
            }
            line[72] = (byte) '\r';
            line[73] = (byte) '\n';
            out.write(line);
            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;
            count++;
        }
    }
}
