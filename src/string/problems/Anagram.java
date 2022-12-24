package string.problems;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Please enter the second word: ");
        String word2 = scanner.nextLine();

        if(isAnagram(word1,word2)) {
            System.out.println(word1+" is an anagram of "+word2);
        }else {
            System.out.println(word1+" is NOT an anagram of "+word2);
        }

        scanner.close();
    }

    // Check if two words are anagrams in Java
    // Uses sorting and comparison of character arrays
    private static boolean isAnagram(String word1, String word2) {
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        return (Arrays.equals(word1Arr, word2Arr));
    }
}
