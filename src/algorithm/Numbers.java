package algorithm;

import databases.ConnectToSqlDB;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
//		Sort algo = new Sort();
//		int a[]={4,2,9,1,6};
//		System.out.println(Arrays.toString(algo.shellSort(a)));
//
//	}
		//print the menu ask the user to choose the desired algorithm

		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);
		//Bubble Sort
		algo.bubbleSort(num);
		long BubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + BubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bubble_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("Bubble_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);
		//Quick Sort
		algo.quickSort(num,0, num.length-1);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers);
		randomize (num, n);
		//Merge Sort
		algo.mergeSort(num,0, num.length-1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers);
		//Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbers);
		//Bucket Sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbers);
		//shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbers);
		//By following above, Continue for rest of the Sorting Algorithm....










		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
