package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Words {
    //method for finding anagrams for given word
    public ArrayList<String> findAnagrams(String word, ArrayList<String> dictionary) {
        //arraylist for our results
        ArrayList<String> result = new ArrayList<String>();
        //sorting and comparison
        for (String target :
                dictionary) {
            if (target.length() == word.length()) {
                //target word from dictionary split to array and sorted
                var alfTarget = target.toCharArray();
                Arrays.sort(alfTarget);
                //same thing for test word
                var alfWord = word.toCharArray();
                Arrays.sort(alfWord);
                //Sorted Arrays are converted to strings to be compared, and their original forms put in result array, IF they arent the test word
                if (new String(alfWord).equals(new String(alfTarget)) && !word.equals(target)) {
                    result.add(target);
                    System.out.println(target);
                }
            }
        }
        //if target word and test word are not the same, we return empty result
        return result;
    }
}