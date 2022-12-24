package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        int largest=0;

        String words[]=wordGiven.split(" ");
        for (int i=0; i< words.length;i++)
        {
          if (largest<words[i].length()){
              largest=words[i].length();
              st=words[i];

          }
        }
        //implement
        map.put(largest,st);
        return map;
    }
}
