package math.problems;
import java.util.Arrays;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        System.out.println("the lowest difference between the two array cell is: "+findLowestDifference(array1,array2));



    }

    public static int findLowestDifference(int[] arr1,int[] arr2){
        int array1Length=arr1.length;
        int array2Length=arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int a=0;
        int b=0;
        int diff=Integer.MAX_VALUE;
        while (a<array1Length && b<array2Length)
        {
            if (Math.abs(arr1[a]-arr2[b])<diff)
            {diff=Math.abs(arr1[a]-arr2[b]);}


            if (arr1[a]<arr2[b]){a++;}
            else b++;


        }

       return diff; //System.out.println("the lowest difference between the two array cell is: "+ diff);
    }

}
