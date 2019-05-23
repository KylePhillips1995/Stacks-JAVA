import java.util.*;
public class StackMUDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackMU<String>listStackMU = new StackMU<String>();
		
		listStackMU.Push("Sponge");
		listStackMU.Push("Lobster");
		listStackMU.Push("Sea Turtle");
		listStackMU.Push("Star Fish");
		listStackMU.Push("Shark");
		listStackMU.Push("Fish");
		listStackMU.Push("Krab");
		listStackMU.Push("Coral");
		
		while(listStackMU.isEmpty())
		{
			
			System.out.println(listStackMU.Pop());
		}
		//end while
		String [] array = {"Sponge", "Lobster", "Sea Turtle", "Star Fish", "Shark", "Fish", "Krab", "Coral"};
		Stack<String>listJava = new Stack<String>();
		System.out.println("\n***** New Java Stack ****");
		
		for(String s:array) {
			
			System.out.println("pushing " + listJava.push(s) + "onto the stack");
			
		}
		
		for(int i=0; i<array.length; i++) {
			
			array[i] = listJava.pop();
		}
		System.out.println("\nreverse array");
		for(String s:array) {
			
			System.out.println(s);
			
		}
		
		
		

	}//end main

}//end class
