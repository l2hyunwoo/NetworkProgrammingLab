package stream;

import java.io.IOException;

public class GenerateCharacters {
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

        while (count < 1000) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                out.write(((i - firstPrintableCharacter) % numberOfPrintableCharacters) + firstPrintableCharacter);
            }
            out.write((byte) '\r');
            out.write((byte) '\n');

            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;
            count++;
        }
    }
}
