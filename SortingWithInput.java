import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class SortingWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> firstList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Something: ");
		
		int value;
		
		do {
			value = input.nextInt(); //read a value from the input
				firstList.add(value);//add value if it not in the list
		}
			while(value !=0);
			
			for(int i = 0; i<firstList.size(); i++)
				System.out.print(firstList.get(i) + " ");
		
		//int[] firstList = {1, 2, 3, 4, 5};
		//these print out first entered list
		//System.out.println(Arrays.toString(firstList));

		
		int[] copiedList = firstList.clone();
		Arrays.sort(copiedList);
		//these print out coppied sorted list
		//System.out.println(Arrays.toString(copiedList));

			if(Arrays.equals(firstList, copiedList)) {
			System.out.println("These are sorted");
		}
			else {
				System.out.println("These are not sorted");
			}
			
		}
	}

		 
