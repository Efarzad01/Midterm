package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		((LinkedList<String>) queue).add("NY");
		((LinkedList<String>) queue).add("NJ");
		((LinkedList<String>) queue).add("CA");

		Iterator<String> it= queue.iterator();

		/*while (it.hasNext() ){
			System.out.println(it.next());
		}*/

		for(String st : queue){
			System.out.println(st);
		}
	}

}
