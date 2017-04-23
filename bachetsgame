package programming_challenges;

public class bachetsgame{
		public static void main(String[] args) {
			Kattio io = new Kattio(System.in);
			
			while(io.hasMoreTokens()) {
				int numStones = io.getInt();
				int numMoves = io.getInt();
				
				int[] moves = new int[numMoves];
				for (int i = 0; i < numMoves; i++){
					moves[i] = io.getInt();
				}
				
				boolean[] flag = new boolean[numStones+1]; 
				flag[0] = true; //Stan can win with 1 stone
				
				//when can Stan win
				for (int i = 1; i <= numStones; i++){
					for (int move: moves){
						//not valid
						if (i-move < 0) continue;
						//can win with a single move
						if (i-move == 0) {
							flag[i] = true;
							break;
						}
						
						//force Ollie to loose
						if (!flag[i-move]){
							flag[i] = true;
							break;
						}
					}
				}
				if(flag[numStones]) System.out.println("Stan wins");
				else System.out.println("Ollie wins");
			}
			io.close();
		}
}

