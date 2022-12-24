package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int[] arr=new int[10];
		int j=0;
		int range=10;
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
				System.out.print(num + " ");
				arr[j]=num;
				j++;
			}
			num++;
		}
		int k=0;
		while (arr[k]!=0) {
			k++;
		}
		int[] array=new int[k];

		for (int s=0;s<k;s++){
			array[s]=arr[s];
			System.out.println(array[s]);
		}
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList();

		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}


	}

}
