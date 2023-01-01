package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int[] array;
		int[] array1=new int[1];
		array = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		System.out.println("the lowest number is :" + lowestNumberMethod(array));
		array1[0]=lowestNumberMethod(array);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
//			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
//			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

			connectToSqlDB.insertDataFromArrayToSqlTable(array1, "tbl_lowestNumber", "Number");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "Number");


		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}



	public static int lowestNumberMethod(int[] array) {
		int lowestNumber;
		//find the lowest number from the array
		lowestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < lowestNumber) {
				lowestNumber = array[i];
			}
		}
		return lowestNumber;

	}


}
