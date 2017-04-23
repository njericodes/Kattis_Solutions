package programming_challenges;

import java.util.Scanner;

public class commercials{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int p = in.nextInt();
			
			//move to next line
			in.nextLine();
			
			//store the commercials
			int[] commercials = new int[n];
			for(int i=0; i<commercials.length; i++){
				commercials[i] = in.nextInt()-p;
			}
			
			//print profit
			int max = maxSequence(commercials);
			System.out.println(max);
		}
		in.close();
	}
	
	//Kadane's algorithm 
	public static int maxSequence(int[] passed){
		int max_so_far = 0;
		int max_ends_here = 0;
		
		for(int i=0; i<passed.length; i++){
			max_ends_here = max_ends_here + passed[i];
			if(max_so_far < max_ends_here) max_so_far = max_ends_here;
			if(max_ends_here < 0) max_ends_here = 0;
		}
		return max_so_far;
	}

}
