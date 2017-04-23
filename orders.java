package programming_challenges;

import java.util.Scanner;

public class orders{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		//store menu items
		int[] menu = new int[n];
		for(int i=0; i<n; i++){
			menu[i] = in.nextInt();
		}
		for(int i=0; i<n; i++){
			System.out.println(menu[i]);
		}
		
		int m = in.nextInt();
		
		for(int i=0; i<m; i++){
			int order = in.nextInt();
			
			int check;
			int count;
			
			check = dynamic(0, n,order);
			
			if(check == 0) System.out.println("Impossible");
			else if(check == 1){
				count = 0;
				results(0,order);
				System.out.println();
			}
			else System.out.println("Ambiguous");
		}
		in.close();
	}
	
	public static int dynamic(int i, int n, int m){
		int result = 0; 
		
		if(i == n) return 0;
		if(m == 0) return 1;
		
		return result;
	}
	
	public static void results(int i, int o){
		
	}
}
