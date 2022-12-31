package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception{
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		System.out.println();

////connect to my database
//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		connectToSqlDB.insertDataFromArrayToSqlTable(ar, "grades", "SortingNumbers");
//		List<String> numbers = connectToSqlDB.readDataBase("grades", "SortingNumbers");
//		//to print out to the console the stored grades
//		printValue(numbers);


/***************************
 * call the primeNumbers method and assign its return values to an array
 */
int range =1000000;




int array[]=primeNumbers(range);
		System.out.println("The prime numbers in the range of 2 to " +range+ " are: ");
		// to print out the prime numbers
		for (int s=0;s<array.length;s++){

			System.out.print(array[s]+" ");
		}
		System.out.println();
		// connect to my database.
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//store the prime numbers find
		connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_primenumber", "SortingNumbers");
		//retrieve the prime numbers from may database and assign it a vector "primenumbers" to print them to the console
		List<String> primenumber  = connectToSqlDB.readDataBase("tbl_primenumber", "SortingNumbers");

		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:primenumber ){
			System.out.print(st+" ");
		}


	}





	public static int[] primeNumbers(int range){
		int[] arr=new int[1000000];
		int j=0;
		int num=2;
		String primeNumbers="";
		while (num<= range)
		{
			int i=2;
			while(i<= num/2)
			{
				if (num % i==0)
				{
					break;
				}
				i++;
			}
			if(i==(num/2+1))
			{

				arr[j]=num;
				j++;
			}
			num++;
		}
		// to find the number of prime number found and use it
		// to declare a array that will contain them with the right length
		int k=0;
		while (arr[k]!=0) {
			k++;
		}
		//declare an array that will contain the exact number of the prime numbers and use later to store in my database
		int[] array=new int[k];
// to print out the prime numbers
		for (int s=0;s<k;s++){
			array[s]=arr[s];

		}
		return array;
	}


//	public static void printValue(List<String> array){
//		for(String st:array){
//			System.out.println(st);
//		}
//	}

}
