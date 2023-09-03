package org.example;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class Words {
    //method for finding anagrams for
    public ArrayList<String> findAnagrams(String word, ArrayList<String> dictionary) {
        ArrayList<String> result = new ArrayList<String>();
        for (String target:
             dictionary) {
            if (target.length() == word.length()) {
                var alfTarget  = target.toCharArray();
                Arrays.sort(alfTarget);
                var alfWord = word.toCharArray();
                Arrays.sort(alfWord);
                if (new String(alfWord).equals(new String(alfTarget)) && !word.equals(target)){
                result.add(target);
                System.out.println(target);
                }
            }
        }

        return result;
    }
}