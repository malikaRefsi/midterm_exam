package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String []ar = st.split("\\s");
        Map<String, Integer> mp= new HashMap<String, Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;

            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }
            }

            mp.put(ar[i], count);
        }

        for (Map.Entry<String,Integer> pairs: mp.entrySet())
        {
            if (pairs.getValue()>1) {
                System.out.println("the word * "+pairs.getKey()+ " * is duplicated "+pairs.getValue()+" times");
            }
        }
        int avrg;
        int cofsum=0;
        int lengthByCof=0;
        for (Map.Entry<String,Integer> pairs: mp.entrySet())
        {
            if (pairs.getValue()>1) {
                cofsum=cofsum+pairs.getValue();
                lengthByCof=lengthByCof+pairs.getKey().length()*pairs.getValue();

            }

        }

        avrg=lengthByCof/cofsum;
        System.out.println("the average length of the duplicates words: "+avrg);



        int avrg2;
        int cofsum2=0;
        int lengthByCof2=0;
        for (Map.Entry<String,Integer> pairs: mp.entrySet())
        {
                cofsum2=cofsum2+pairs.getValue();
                lengthByCof2=lengthByCof2+pairs.getKey().length()*pairs.getValue();

        }

        avrg2=lengthByCof2/cofsum2;
        System.out.println("the average length of all the words in the given sentence is: "+avrg2);

    }

}
