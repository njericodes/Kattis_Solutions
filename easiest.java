package programming_challenges;
import java.util.Scanner;

public class easiest{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		//gets the input number to test
		while(input.hasNextLine()){
			int N = Integer.parseInt(input.nextLine());
			//if its 0, exit loop
			if(N == 0) break;
			//call get sum to test
			getSum(N);
		}
		//close the scanner
		input.close();
	}
	
	//checks the sum of digits in N against the sum of digits of p*N
	public static void getSum(int N){
			int p = 11; //we use values greater than 10
			boolean found = false; 
			
			//loops until the lowest number that satisfies the condition is found
			while(!found){
				int mult = p*N;
				if(sumDigits(mult) == sumDigits(N)){
					System.out.println(p);
					found = true;
				}
				else p++;
			}	
	}
	
	//simply sums up the digits of a given number 
	public static int sumDigits(int in){
		int sum = 0;
		
		while(in > 0){
			sum = sum +(in%10);
			in = in/10;
		}
		return sum;
	}
}


