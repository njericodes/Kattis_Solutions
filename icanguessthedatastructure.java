package programming_challenges;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class icanguessthedatastructure_260588566{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//create the 3 data structures to test
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		
		while(input.hasNext()){	
			//get the number of input we are going to test
			int numLine = input.nextInt();
			
			//this will keep track of the state of the data structures
			boolean isQueue = true, isStack = true, isPQueue = true;
			
			//after each loop we clear the data structures
			stack.clear();
            queue.clear();
            pqueue.clear();
			
			for(int i=0; i<numLine; i++){	
				//getting the command and its value
				int command = input.nextInt();
				int value = input.nextInt();
				
				//if the command == 1, we push the values 
				if(command == 1){
					if(isQueue) queue.add(value);
					if(isStack) stack.push(value);
					if(isPQueue) pqueue.add(-value);
				}else{//if 2 we remove and test against the value
					if(isQueue && !queue.isEmpty()){
						if(queue.poll() != value) isQueue = false;
					}else isQueue = false;
						
					if(isStack && !stack.isEmpty()){
						if(stack.pop() != value) isStack = false;
					}else isStack = false;
						
					if(isPQueue && !pqueue.isEmpty()){
						if((-1*pqueue.poll()) != value) isPQueue = false;
					}else isPQueue = false;
				}
			}//check which data structure it is 
			if(!isQueue && !isStack && !isPQueue) System.out.println("impossible");
			else if(isQueue && !isStack && !isPQueue) System.out.println("queue");
			else if(!isQueue && isStack && !isPQueue) System.out.println("stack");
			else if(!isQueue && !isStack && isPQueue) System.out.println("priority queue");
			else System.out.println("not sure");
		}
	//close scanner
	input.close();
	}
}
