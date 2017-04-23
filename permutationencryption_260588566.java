package programming_challenges;

import java.util.Scanner;

public class permutationencryption_260588566{
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			//n is the length of the key
			int n = in.nextInt();
			
			if(n==0) break;
			
			//make key array
			int[] key = new int[n];
			for(int i=0; i<key.length; i++){
				key[i] = in.nextInt();
			}
			
			in.nextLine(); //move to the next line
			
			//this has the message to encrypt
			String msg = in.nextLine();
			
			//add padding if not multiple of n
			while (msg.length()%n != 0) msg += " ";
				
			//make array to keep the encrypted string
			char[] msgArray = new char[msg.length()];
			
			//encryption
			for (int i = 0; i<msgArray.length; i++){
				msgArray[i] = msg.charAt(key[i%n]-1);
				key[i%n] += n;
			}
			String output = new String(msgArray);
			
			System.out.println("'" + output + "'");
		}
		in.close();
	}
}
