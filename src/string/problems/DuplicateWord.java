package string.problems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        HashMap<String,Integer> map = duplicates(st);
        Set <Entry<String,Integer>> entrySet=map.entrySet();
        for (Entry<String,Integer> entry:entrySet)
        {
            if (entry.getValue()>1) {
                System.out.println("the word * "+entry.getKey()+ " * is duplicated "+entry.getValue()+" times");

            }
        }
//               System.out.println(map);
        System.out.println("the average length of the duplicates words: "+getAvrgLength(map));

//
//
//
//        int avrg2;
//        int cofsum2=0;
//        int lengthByCof2=0;
//        for (Map.Entry<String,Integer> pairs: map.entrySet())
//        {
//                cofsum2=cofsum2+pairs.getValue();
//                lengthByCof2=lengthByCof2+pairs.getKey().length()*pairs.getValue();
//
//        }
//
//        avrg2=lengthByCof2/cofsum2;
//        System.out.println("the average length of all the words in the given sentence is: "+avrg2);

    }
    public static HashMap<String, Integer> duplicates(String str){
        String []ar = str.split("\\s");
        HashMap<String,Integer> mp= new HashMap<String, Integer>();
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



        int inc=0;
// to figure out the length of the array we will create to store the duplicates words
        Set <Entry<String,Integer>> entrySet=mp.entrySet();
        for (Entry<String,Integer> entry:entrySet)
        {
            if (entry.getValue()==1) {
                  inc++;
            }
        }
        String collect[]=new String[inc];
        int k=0;
        for (Entry<String,Integer> entry:entrySet) {
            if (entry.getValue() == 1) {
                collect[k] = entry.getKey();
                k++;
            }
        }
        for (int d=0;d<inc;d++){mp.remove(collect[d]);}



        return mp;
    }

    public static double getAvrgLength(HashMap<String,Integer> map) {
        double avrg;
        int cofsum=0;
        int lengthByCof=0;
        Set <Entry<String,Integer>> entrySet=map.entrySet();
        for (Entry<String,Integer> entry:entrySet)
        {

                cofsum=cofsum+entry.getValue();
                lengthByCof=lengthByCof+entry.getKey().length()*entry.getValue();


        }

       return avrg=lengthByCof/cofsum;

    }


}
