import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class SortingWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Something: ");
		
		int value;
		
		do {
			value = input.nextInt(); //read a value from the input
				list.add(value);//add value if it not in the list
		}
			while(value !=0);
			
			for(int i = 0; i<list.size(); i++)
				System.out.print(list.get(i) + " ");
		
		int[] firstList = {};
		//these print out first entered list
		//System.out.println(Arrays.toString(firstList));

		
		int[] copiedList = firstList.clone();
		Arrays.sort(copiedList);
		//these print out coppied sorted list
		//System.out.println(Arrays.toString(copiedList));

			if(Arrays.equals(firstList, copiedList)) {
			System.out.println("These are sorted");
		}
			{
				System.out.println("These are not sorted");
			}
			
		}
	}

		 
