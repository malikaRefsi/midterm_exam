package datastructure;

import algorithm.Numbers;
import algorithm.Sort;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.Map.Entry;
public class UseArrayList {

	public static void main(String[] args) throws Exception{
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> grades= new ArrayList<>();
		grades.add(17);
		grades.add(19);
		grades.add(15);
		grades.add(12);
		grades.add(20);

		System.out.println("contents of the ArrayList *fruit* before remove: ");
		System.out.println("Extracting the elements using for each loop" );
		//iterate through the arrayList grade using for loop
		for (Integer element:grades)
		{
				System.out.println(element);
		}

		// remove an element using the index
		grades.remove(1);
		System.out.println("contents of the ArrayList *grade* after remove: ");
		//System.out.println(fruit);
		System.out.println("Extracting the elements using Iterator" );
		Iterator it1=grades.iterator();
		while (it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("By applying peek method (LIFO), we will get the following:");
		System.out.println(peek(grades));

		// to stored grades elements in my database
	//first convert grade to an array
int ar[]= new int[grades.size()];
for (int i=0;i<grades.size();i++){ar[i]=grades.get(i);}

		//create object to call Selection Sort method
		Sort algo = new Sort();
//Apply Selection Sort on ar
		algo.selectionSort(ar);

		//connect to my database
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromArrayToSqlTable(ar, "sortedGrades", "Grades");
		List<String> numbers = connectToSqlDB.readDataBase("sortedGrades", "Grades");
		//to print out to the console the stored grades
		printValue(numbers);



}
//peek method is not supported by arraylist, work on the stack instead
	// however we can create one that imitates its functionality


	public static Integer peek(ArrayList<Integer> elements) {
		if (elements.isEmpty()) {
			return null;

		}
		else
			return  elements.get(elements.size()-1);
	}

	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
