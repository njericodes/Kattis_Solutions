package programming_challenges;

import java.util.Scanner;

public class peragrams_260588566{
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			//get the string 
			String input = in.nextLine();
			int len = input.length();
			
			//array to hold the characters
			char[] characters = new char[26];
			
			//count the characters in the string
			for(int i=0; i<len; i++){
				characters[input.charAt(i) - 'a']++;
			}
			
			//to hold the number
			int remove = 0;
			
			//look for odd numbered letters in the characters array
			//we can always remove odd numbered letters
			for(int i=0; i<characters.length; i++){
				if((characters[i]%2)==1) remove++;
			}
			
			//one odd letter is always good
			if(remove>0) remove--;
			
			//print 
			System.out.print(remove);
		}
		in.close();
	}
}
