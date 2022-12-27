package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String str = scanner.nextLine(); // read in a string

                // Convert the string to lowercase
                str = str.toLowerCase();
                boolean A = isPalindrome(str);
                if (A==false){System.out.println(str+ ", the entered String is not Palindrome.");}
                else {System.out.println(str+ ", the entered String is Palindrome.");}


    }
    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}
