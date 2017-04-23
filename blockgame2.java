package programming_challenges;

import java.util.Arrays;

public class blockgame2 {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in);
		long N = io.getInt();
		long M = io.getInt();
		
		boolean[][] canWin = new boolean[(int)N+1][(int)M+1];
		
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if (j == 0 || i == 0) { //base case
					canWin[i][j] = false;
					continue;
				}
				
				if (j == 1 || i == 1) { //base case
					canWin[i][j] = true;
					continue;
				}
				
				if (j%i == 0 || i%j == 0) {
					canWin[i][j] = true;
					continue;
				}
				
				//Look at our possible moves
				for (int k = i - j; k > 0; k = k - j) {
					if(!canWin[k][j]) {
						canWin[i][j] = true;
						break;
					}
				}
				
				if(!canWin[i][j]) {
					for (int k = j - i; k > 0; k = k - i) {
						if(!canWin[i][k]) {
							canWin[i][j] = true;
							break;
						}
					}
				}
			}
		}
		
		//System.out.println(Arrays.deepToString(canWin));
		
		if (canWin[(int)N][(int)M]) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		io.close();
	}

}
