package math.problems;

import algorithm.Sort;
import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        // apply test on the factorial method when calculating the Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
        long expectedResult=120;
        int givenNumber=5;

        //Create Factorial object
        Factorial factorial = new Factorial();
        //calculate the Factorial of 5 using Factorial.factorialOfGivenNumber
        long actualResult=Factorial.factorialOfGivenNumber(givenNumber);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expectedResult,actualResult);

        }catch(Exception ex){
            ex.getMessage();
        }


        // apply test on the Fibonacci method to find and Write 40 Fibonacci numbers with java.
        int [] expectedResult2= {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025 ,121393, 196418, 317811, 514229,
                832040 ,1346269 ,2178309 ,3524578 ,5702887 ,9227465 ,14930352, 24157817, 39088169 ,63245986};


        //Create Factorial object
        Fibonacci fibo= new Fibonacci();
        // find and Write 40 Fibonacci numbers using fibonacci method
        int [] actualResult2=fibo.fibonacci(40);
        //verify if the expected array equal to the one find using fibonacci algorithm.
        try {
            Assert.assertArrayEquals(expectedResult2,actualResult2);

        }catch(Exception ex){
            ex.getMessage();
        }

        // apply test on the findLowestDifference method to find the lowest difference between the two array cell.
        int [] array1 = {30,12,5,9,2,20,33,1};
       int [] array2 = {18,25,41,47,17,36,14,19};
        int expectedResult3= 1;


        //Create FindLowestDifference object
        FindLowestDifference findLowestDiff= new FindLowestDifference();
        // use findLowestDifference method to find the lowest difference between the two array cell
        int actualResult3=findLowestDiff.findLowestDifference(array1,array2);
        //verify if the expected value if it is equal to the one find using findLowestDifference algorithm.
        try {
            Assert.assertEquals(expectedResult3,actualResult3);

        }catch(Exception ex){
            ex.getMessage();
        }

        // apply test on the findMissingElement method which find the missing number in the given array cell.
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult4= 9;


        //Create FindLowestDifference object
        FindMissingNumber FindMissingNum= new FindMissingNumber();
        // use findLowestDifference method to find the lowest difference between the two array cell
        int actualResult4=FindMissingNum.findMissingElement(array, array.length);
        //verify if the expected value if it is equal to the one find using findMissingElement algorithm.
        try {
            Assert.assertEquals(expectedResult4,actualResult4);

        }catch(Exception ex){
            ex.getMessage();
        }

        // apply test on the pattern method and confirm if it does the right pattern to much to expected pattern
        int [] expectedResult5={100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 88, 86, 84, 82, 80, 78, 76, 74, 72,
                70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};
        //Create Pattern object
        Pattern patternn= new Pattern();
        // find and Write 40 Fibonacci numbers using fibonacci method
        int [] actualResult5=patternn.pattern(100);
        //verify if the expected array equal to the one find using pattern algorithm.
        try {
            Assert.assertArrayEquals(expectedResult5,actualResult5);

        }catch(Exception ex){
            ex.getMessage();
        }




        /* apply test on the primeNumbers method
        * and in this purpose we will use a smaller rage of 2 to 100
         */
        int [] expectedResult8= {2 ,3, 5, 7, 11, 13, 17, 19 ,23, 29, 31, 37, 41, 43, 47 ,53 ,59 ,61
                ,67 ,71, 73, 79, 83, 89, 97};


        //Create PrimeNumber object
        PrimeNumber primeNumber= new PrimeNumber();
        // find and Write 40 Fibonacci numbers using fibonacci method
        int [] actualResult8=primeNumber.primeNumbers(100);
        //verify if the expected array equal to the one find using primNumbers algorithm.
        try {
            Assert.assertArrayEquals(expectedResult8,actualResult8);

        }catch(Exception ex){
            ex.getMessage();
        }



    }
}
