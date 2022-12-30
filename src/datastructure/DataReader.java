package datastructure;

import databases.ConnectToSqlDB;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;



public class DataReader {

	public static void main(String[] args)  throws Exception{
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		                       /*********************************************/
            /*****the steps to read the given textFile and print to console*************/
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr= null;
		BufferedReader bf=null;
		String fileName="C:\\Users\\Malika Refsi\\IdeaProjects\\midterm-coding-exam\\src\\data\\self-driving-car";
		try {
			fr = new FileReader(fileName);
			String st = "";
			try {
				bf = new BufferedReader(fr);
				while ((st = bf.readLine()) != null) {
					System.out.println(st);
				}
			} catch(FileNotFoundException e){
					throw new RuntimeException(e);
			}
			finally {
				try {
					fr.close();
				}catch (IOException e){e.printStackTrace();}
				try {
				if (bf!=null){bf.close();}
				}catch (IOException e){e.printStackTrace();}
			}
		} catch (IOException e) {
				throw new RuntimeException(e);
		}

/****************************************************/
//read the text file into an arrayList
/****************************************************/

		LinkedList<String> textInToLinkedLIst = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(
				new File(fileName)))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) {
					Stream.of(line.split("\\s+"))
							.forEachOrdered(word -> textInToLinkedLIst.add(word));
				}
			}
		} catch (Exception e) {
			System.out.printf("Caught Exception: %s%n", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("store the text file into LinkedLest");
		System.out.println(textInToLinkedLIst );

/*****************************************************/
//iterate through the LinkedList of words using for each loop
/*****************************************************/
		System.out.println("iterate through the LinkedList of words using for each loop:");
		for (String element:textInToLinkedLIst)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		/****************************************************/
		//convert the linkedlist to an array object
		Object[] array =textInToLinkedLIst.toArray();
		//convert object array to string array
        String[] strArray=Arrays.copyOf(array,array.length,String[].class);
		/****************************************************/
		//connect to my database
		/****************************************************/
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromStringArrayToSqlTable(strArray, "textToWords", "words");
		List<String> words = connectToSqlDB.readDataBase("textToWords", "words");
		//to print out to the console the stored words
		System.out.println("Print out to the console the stored words in may database:  ");
		printValue(words);
		System.out.println();


		/****************************************************/
		//read the text file into a Stack
		/****************************************************/
		Stack<String> textInToStack = new Stack<>();
		//Deque<String> textInToQueue = new ArrayDeque<>();

		try (BufferedReader br = new BufferedReader(new FileReader(
				new File(fileName)))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) {
					Stream.of(line.split("\\s+"))
							.forEachOrdered(word -> textInToStack.add(word));
				}
			}
		} catch (Exception e) {
			System.out.printf("Caught Exception: %s%n", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After reading the text file into a Stack:");
		System.out.println(textInToStack );

		/********************************************************/
		//iterate through the arrayList grade using for each loop
        /*****************************************************/
		System.out.println("iterate through the stack using for each loop");
		for (String element:textInToStack)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		/********************************************************/
		//Applying pool on the array to show the FILO order or property
		/*****************************************************/
		System.out.print("Applying pool on the array to show the FILO and LIFO order and show the result which is: ");
		System.out.println(textInToStack.pop() );
		/*****************************************************/
		System.out.println("iterate through the stack using while with Iterator after applying pop()");
		//Extracting the elements using Iterator
		Iterator<String> it=textInToStack.iterator();
		while (it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		/********************************************************/
		System.out.println("the result after applying search(cars): ");
		System.out.println(textInToStack.search("Self-driving")+"  which is the last position where the word appeared");
		System.out.println("the result after applying peek(): ");
		System.out.println(textInToStack.peek()+ ": which is the last element of the stack (taking in consideration that the very last element we removed it using pop)");
		System.out.println("However if we apply push(\"steps.\") will add: "+textInToStack.push("steps.")+" to the stack");
		System.out.println("the stack after push word: steps.");
		System.out.println("iterate through the stack using while with Iterator after applying push()");
		//Extracting the elements using Iterator
		Iterator<String> it2=textInToStack.iterator();
		while (it2.hasNext()){
			System.out.print(it2.next()+" ");
		}
		System.out.println();
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.print(st+" ");
		}
	}

}
