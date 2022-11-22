import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Collections;
public class FinalArrayListSort {

	/*
	 * used geeks for geeks examples, not any type of completed examples, used collections.sort, 
	 * .clone, etc...
	 * 
	 * built program off book and web research. 
	 * 
	 * ground it out with research and asked google right questions!
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> firstList =
				new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers (input ends with zero): ");
		int value;
		
		do {
			value = input.nextInt(); //read value from input
			if(!firstList.contains(value) && value != 0)
				firstList.add(value);//add the value if it is not in the list
		} while(value != 0);
		
		System.out.println("First entered list is " + firstList);
		
		
		//creating another list
		ArrayList<Integer> copiedList = new ArrayList<Integer>();
		//why Below?
		copiedList = (ArrayList<Integer>) (firstList).clone();
		System.out.println("Second cloned list is: " + copiedList);
		
		Collections.sort(copiedList);
		
		System.out.println("Sorted copied list is: " + copiedList);
		
		if (copiedList.equals(firstList) == true) {
			System.out.println("These are sorted");
		}
		else {
			System.out.println("These are not sorted");
		}
	}

}

//		firstList.add(1);
//		firstList.add(3);
//		firstList.add(5);
//		firstList.add(4);
//		firstList.add(2);