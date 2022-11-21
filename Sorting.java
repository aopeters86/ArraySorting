import java.util.Scanner;
import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstList = {2, 1, 3, 5, 4};
		int[] copiedList = new int[firstList.length];
		//any way to copy sorted list into a new list?
		int[] sortedList = new int[Arrays.sort(firstList)];
		//need to make user input for this array
		
		
		
		//from the method? below to store array?
		//double[] sorted;
		
		//for loop to copy the input into another list - from book 
		for(int i = 0; i<firstList.length; i++) {
			copiedList[i] = firstList[i];
			System.out.print("--"+ copiedList[i]);
		}
				
		//for loop to print out list not necessary 
//		for(int i = 0; i <firstList.length ; i++) {
//			//System.out.println(firstList[i] + " ");
//			//Arrays.sort(firstList);
//			//System.out.print(firstList[i] + " ");
//		
//			
//		}
		 
		//how to copy this sorted array and then compare if they're equal?
		for(int i = 0; i < firstList.length; i++) {
			Arrays.sort(firstList);
			firstList = sortedList[i];
			//System.out.print(firstList[i]+" ");
			
		}
		
//		if(firstList[i] != Arrays.sort(firstList[])) {
//			System.out.println();,
//		}
		
		
//		if(firstList.equals(copiedList)) {
//			System.out.println("These are sorted");
//		}
		
		//copy array 
		//System.out.println(getSorted(firstList));
		
			
		}
		
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
		
	}

			
		

		
		
		



//		firstList[0] = 2;
//		firstList[1] = 1; 
//		firstList[2] = 3;
//		firstList[3] = 5;
//		firstList[4] = 4;