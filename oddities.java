package programming_challenges;

import java.util.Scanner;

public class oddities{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//get the number of lines of input expected
		int n = Integer.parseInt(input.nextLine());
		
		//put input values in an array
		int arr [] = new int[n];
		for (int i=0; i<n; i++){
			arr[i] = Integer.parseInt(input.next());
		}
		
		//check if odd or even for each value in the input array
		for(int i=0; i<arr.length; i++){
			if((arr[i]%2) == 0) System.out.println(arr[i] + " is even");
			else System.out.println(arr[i] + " is odd");
		}
		//close the scanner
		input.close();
	}
}
