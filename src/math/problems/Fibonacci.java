package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
        */
        int arr[]=fibonacci (40);
        for (int i = 0; i < 40; i++)
        {
            System.out.print(" " + arr[i]);
        }

    }
    public static int[] fibonacci(int count) {
        int n1 = 0;
        int n2 = 1;

        int array[]=new int[count];
        array[0]=0;
        array[1]=1;
        int n3;

        for (int i = 2; i < count; i++) {
            array[i] = n1 + n2;
            n1 = n2;
            n2 = array[i];
        }
        return array;
    }
}
