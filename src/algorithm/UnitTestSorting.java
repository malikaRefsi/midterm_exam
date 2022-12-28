package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
             Assert.assertArrayEquals(sortedArray,sort.selectionSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        //apply unsorted array to insertionSort.
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.insertionSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to bubbleSort.
        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubbleSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.bubbleSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to quickSort.
        sort.quickSort(unSortedArray,0, unSortedArray.length-1);
        //verify if the unsorted array is sorted by the quickSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.quickSort(unSortedArray,0, unSortedArray.length-1));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to mergeSort.
        sort.mergeSort(unSortedArray,0, unSortedArray.length-1);
        //verify if the unsorted array is sorted by the mergeSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.mergeSort(unSortedArray,0, unSortedArray.length-1));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to heapSort.
        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heapSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.heapSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to bucketSort.
        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucketSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.bucketSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }
        //apply unsorted array to shellSort.
        sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the shellSort algorithm.
        try {
            Assert.assertArrayEquals(sortedArray,sort.shellSort(unSortedArray));

        }catch(Exception ex){
            ex.getMessage();
        }





    }
}
