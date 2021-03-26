package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public List<Character> uniqueChars(String str){
        List<Character> chars = new ArrayList<>();
        if(str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid parameter");
        }
        LinkedHashSet<Character> results = new LinkedHashSet<>();
        char []arr = str.toCharArray();
        for(char item : arr){
            results.add(item);
            }

        return getCharacterList(chars, results);
    }

    private List<Character> getCharacterList(List<Character> chars, LinkedHashSet<Character> results) {
        for(Character item : results){
            chars.add(item);
        }
        return chars;
    }


}

