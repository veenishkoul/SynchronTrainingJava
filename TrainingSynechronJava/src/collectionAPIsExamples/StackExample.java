package collectionAPIsExamples;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> s = new Stack<Object>();
		//Add a value
		s.push("A");
		s.push(4);
		s.push("Hello");
		//s.iterator
		//for each loop
		//s.listIterator()
		System.out.println(s);
		//Remove a value
		System.out.println(s.peek()); //display top value in the stack
	    System.out.println(s.pop()); // remove top value display
	    System.out.println(s);
	    System.out.println(s.search("B")); //diplays -1 for no match and index location for the match

		System.out.println(s instanceof Serializable);
		System.out.println(s instanceof Cloneable);
		System.out.println(s instanceof RandomAccess);

	}

}
