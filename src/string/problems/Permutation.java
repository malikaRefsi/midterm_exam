package string.problems;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */



        // create an object of scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter the string: ");
        String st = input.nextLine();

        System.out.println("Number of permutations of the string " + st + " is: "  + getPermutation(st).size());
        System.out.println("And the permutations of " + st + " are: \n" + getPermutation(st));

        }
    public static ArrayList<String> getPermutation(String str) {

        // create a set to avoid duplicate permutation
        ArrayList<String> permutations = new ArrayList<String>();

        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        ArrayList<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }



}
