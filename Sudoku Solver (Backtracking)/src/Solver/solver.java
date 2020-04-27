package Solver;

public class solver {
	
	public static void main (String[] args) {
		int [][] board  = {
						{7,8,0,4,0,0,1,2,0},
					    {6,0,0,0,7,5,0,0,9},
					    {0,0,0,6,0,1,0,7,8},
					    {0,0,7,0,4,0,2,6,0},
					    {0,0,1,0,5,0,9,3,0},
					    {9,0,4,0,6,0,0,0,5},
					    {0,7,0,3,0,0,0,1,2},
					    {1,2,0,0,0,7,4,0,0},
					    {0,4,9,2,0,6,0,0,7}
						};
		PrintBoard(board);
	}
	
	public static void PrintBoard(int board[][]) {
		for (int i=0; i<board.length; i++) {
			if (i%3==0 && i!=0) {			
				System.out.println("- - - - - - - - - - - - - ");
			}
			for (int j=0; j<board[i].length; j++) {
				if (j%3==0 && j!=0) {
					System.out.print(" | ");
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
