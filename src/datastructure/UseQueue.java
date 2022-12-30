package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//queue FIFO
		Queue<String> line =new LinkedList<String>();
		line.add("Amastan");
		line.add("Hocine");
		line.add("Ismat");
		line.add("Mali");
		line.add("Lora");
		System.out.println("contents of the queue *line* before any modifications: ");
		System.out.println("Extracting the elements using for each loop" );
		//iterate through the arrayList line using for each loop
		for (String item:line){
			System.out.println(item);
		}
		System.out.println("Result when applying peek on the line: "+ line.peek());
		System.out.println("contents of the queue *line* after using peek method: ");
		//iterate through the arrayList line using for each loop
		for (String item:line){
			System.out.println(item);
		}
		System.out.println("Result when applying poll method: "+ line.poll());
		System.out.println("contents of the queue *line* after using poll method: ");
		//iterate through the arrayList line using for each loop
		for (String item:line){
			System.out.println(item);
		}

		line.remove("Lora");
		System.out.println("contents of the queue *line* after using remove method: ");
		//Extracting the elements using Iterator
		Iterator<String> it=line.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}



	}

}
