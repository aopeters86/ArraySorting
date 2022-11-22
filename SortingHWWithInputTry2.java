import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SortingHWWithInputTry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> firstList = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Someting (input ends with zero): ");
		int value;
		
		do {
			value = input.nextInt(); //read value from input
			if(!firstList.contains(value) && value != 0)
				firstList.add(value);//add the value if it is not in the list
		} while(value != 0);
		
		int[] firstList = {1, 2, 3, 4, 5};
		//System.out.println(Arrays.toString(firstList));
		//int[] copiedList = new int[firstList.length];
		//any way to copy sorted list into a new list?
		//int[] sortedList = new int[Arrays.sort(firstList)];
		//need to make user input for this array
		
		int[] copiedList = firstList.clone();
		Arrays.sort(copiedList);
		//System.out.println(Arrays.toString(copiedList));
		//from the method? below to store array?
		//double[] sorted;
		
		//for loop to copy the input into another list - from book 
//		for(int i = 0; i<firstList.length; i++) {
//			copiedList[i] = firstList[i];
//			System.out.print("--"+ copiedList[i]);
//		}
				
		//for loop to print out list not necessary 
//		for(int i = 0; i <firstList.length ; i++) {
//			System.out.print(firstList[i] + " ");
//			Arrays.sort(firstList);
			//System.out.print(firstList[i] + " ");
//		}
			if(Arrays.equals(firstList, copiedList)) {
			System.out.println("These are sorted");
		}
			else {
				System.out.println("These are not sorted");
			}
			
		}
	}

		 
		//how to copy this sorted array and then compare if they're equal?
//		for(int i = 0; i < copiedList.length; i++) {
//			Arrays.sort(copiedList);
//			int temp = firstList[i];
//			firstList[i] = sortedList[i];
//			System.out.print(firstList[i] +" ");
//			
//		}
		
//		if(firstList[i] != Arrays.sort(firstList[])) {
//			System.out.println();,
//		}
		
		
//		if(firstList.equals(copiedList)) {
//			System.out.println("These are sorted");
//		}
		
		//copy array 
		//System.out.println(getSorted(firstList));
		
			
		
		
//		public static String getSorted(double[] first) {
//			Arrays.sort(first);
//				System.out.println();
//				return ;
			
//			if(first != double[] firstList) {
//			return " This is not sorted ";
//			
//			}
//			
//			else {
//				return "This is sorted";
//			}
//			
//			
	
		//}

//		firstList[0] = 2;
//		firstList[1] = 1; 
//		firstList[2] = 3;
//		firstList[3] = 5;
//		firstList[4] = 4;