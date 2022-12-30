package datastructure;
import databases.ConnectToSqlDB;

import java.util.*;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

public class UseMap {

	public static void main(String[] args) throws Exception{
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		//Adding List<String> into a Map.
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		//Demonstrate how to we can store elements in a map and store elements into it after adding List.
		//specially demonstrate how to assign multiple values to a single key
		//and for that we create list one and store values into it
		List<String> fruit= new ArrayList<>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Grapes");

		//and for that we create list two and store values into it
		List<String> members =new ArrayList<>();
		members.add("malak");
		members.add("sama");
		members.add("amar");
		members.add("amastan");
		list.put("family", members);
		list.put("Favorite",fruit);



		System.out.println("contents of the Map after the storing data into the map : ");
		System.out.println("Iterating through the map's elements using for each loop" );
		//iterate trough the map using for each loop
		Map<String, List<String>> map = list;
		for (Map.Entry<String,List<String>> entry:list.entrySet())
		{
			System.out.println("- The key is: "+entry.getKey()+ ", The values are: "+entry.getValue());

		}

	/*********************/
		System.out.println("Iterating through the map's elements using While loop with Iterator" );
		Iterator<String> iterator=list.keySet().iterator();
		while (iterator.hasNext()){
			String key=iterator.next();

			System.out.println("- The key is: "+key+ ", The values are: "+list.get(key));

		}

		/****************************************************/

       /****************************************************/
		//connect to my database
		/****************************************************/
//		String ar1[]=new String[]{"1","3","47","0"};
//		String ar2[]=new String[]{"2","3","000","0"};
//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		connectToSqlDB.insertDataToSqlTableWithTwoColumns(ar1,ar2, "storeMap", "keys","values");
//		List<String> keys = connectToSqlDB.readDataBase("storeMap", "Keys");
//		//to print out to the console the stored words
//		System.out.println("Print out to the console the stored keys in may database:  ");
//		printValue(keys);
//		System.out.println();
//		List<String> values = connectToSqlDB.readDataBase("storeMap", "values");
//		//to print out to the console the stored words
//		System.out.println("Print out to the console the stored values in may database:  ");
//		printValue(values);
//		System.out.println();

	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
