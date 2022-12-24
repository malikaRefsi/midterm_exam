package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //Using the iteration:
        int givenNumber=5;
        int factorialProduct=1;
        System.out.print("Using the iteration the "+givenNumber+"! = ");
        for (int i=givenNumber; i>1;i--)
        {
            factorialProduct=factorialProduct*i;
            System.out.print(i+"*");
        }
        System.out.print(1);
        System.out.println(" = "+factorialProduct);
        //Using the recursion:
       long result=factorialOfGivenNumber(givenNumber);
        System.out.println("Using the recursion the "+givenNumber+"! = "+result);

    }
    //create a method factorial which call itself to achieve recursion:
    public static long factorialOfGivenNumber(int Number){
        if (Number<=1) return 1;
        else return Number * factorialOfGivenNumber(Number - 1);
    }

}
