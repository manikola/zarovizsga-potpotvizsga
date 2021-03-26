package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String fileName, char c) {
        if (!(c == '0' || c == '1' || c == 'x')) {
            throw new IllegalArgumentException("Invalid input");
        }
        int count = 0;

        try {
            String text = Files.readString(Path.of(fileName));

            if (text == "" || !containsCharacter(text, c)) {
                return 0;
            }
            for (char item : text.toCharArray()) {
                if (item == c) {
                    count++;
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return count;
    }

    private boolean containsCharacter(String s, char c) {
        for (char item : s.toCharArray()) {
            if (item == c) {
                return true;
            }
        }
        return false;
    }


}

