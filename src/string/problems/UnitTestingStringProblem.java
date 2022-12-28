package string.problems;

import math.problems.Factorial;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        //Apply Unit testing into isAnagram methods to check the given words are anagram or not.
        //start by the positive testing
        String word1="cat";
        String word2="act";
        boolean eexpectedResult=true;

        //Create Anagram object
        Anagram anagram = new Anagram();
        //applying the isAnagram method;
        boolean actualResult=anagram.isAnagram(word1,word2);

        try {
            Assert.assertEquals(eexpectedResult,actualResult);

        }catch(Exception ex){
            ex.getMessage();
        }
//followed by the negative testing
        String word3="crt";
        String word4="aft";
        boolean expectedResult1=false;
        //applying the isAnagram method;
        boolean actualResult1=anagram.isAnagram(word3,word4);
        try {
            Assert.assertEquals(expectedResult1,actualResult1);

        }catch(Exception ex){
            ex.getMessage();
        }
//Apply Unit testing into isAnagram methods to check the given words are anagram or not.
 //       the given string
        String st="Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> expectedResult2= new HashMap<String, Integer>();
        expectedResult2.put("Java",3);
        expectedResult2.put("is",3);

        //Create DuplicateWord object
        DuplicateWord duplicateWord = new DuplicateWord();
        //applying the duplicates method
        Map<String, Integer> actualResult2=duplicateWord.duplicates(st);
        try {
            Assert.assertEquals(expectedResult2,actualResult2);

        }catch(Exception ex){
            ex.getMessage();
        }

        //Apply Unit testing into isPalindrome methods to check the given words are Palindrome or not.
        //start by the positive testing
        String wrd1="mam";

        boolean eexpectedResult5=true;

        //Create Palindrome object
        Palindrome palindrome = new Palindrome();
        //applying the isPalindrome method;
        boolean actualResult5=palindrome.isPalindrome(wrd1);

        try {
            Assert.assertEquals(eexpectedResult5,actualResult5);

        }catch(Exception ex){
            ex.getMessage();
        }
//followed by the negative testing
        String wrd2="dear";
        boolean expectedResult6=false;
        //applying the is method;
        boolean actualResult6=palindrome.isPalindrome(wrd2);
        try {
            Assert.assertEquals(expectedResult6,actualResult6);

        }catch(Exception ex){
            ex.getMessage();
        }

//Apply Unit testing into isAnagram methods to check the given words are anagram or not.

        String str="ABC";
      //  "ABC" "BAC" "BCA" "ACB" "CAB" "CBA"
        ArrayList<String>  expectedResult7=new ArrayList<>();
        expectedResult7.add("ABC");
        expectedResult7.add("BAC");
        expectedResult7.add("BCA");
        expectedResult7.add("ACB");
        expectedResult7.add("CAB");
        expectedResult7.add("CBA");

        //Create Permutation object
        Permutation permutation = new Permutation();
        //applying the getPermutation method;
        ArrayList<String> actualResult7= permutation.getPermutation(str);

        try {
            Assert.assertEquals(expectedResult7,actualResult7);

        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
