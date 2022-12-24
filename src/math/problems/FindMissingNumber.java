package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int n= array.length;
         //call the findMissingElement(int arr, int N) method
        findMissingElement(array,n);

    }
    public static void findMissingElement(int[] arr, int N)
    {
        int i;
        int temp[]=new int [N+1];
        for (i=0;i<=N;i++){
            temp[i]=0;
        }
        for (i=0;i<N;i++){
            temp[arr[i]-1]=1;
        }
        int result=0;
        for (i=0;i<=N;i++){
           if( temp[i]==0){result=i+1;}
        }
        System.out.println(result);
    }
}
