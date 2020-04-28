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
	
	public static boolean valid(int board[][], int num, int[] pos) {
		//Check rows
		for (int i=0; i<board[0].length; i++) {
			if (board[pos[0]][i]==num && pos[1]!=i) {
				return false;
			}
		}
		for (int i=0; i<board.length; i++) {
			if(board[i][pos[0]]==num && pos[0]!=i) {
				return false;
			}
		}
		return true;
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
	
	public static int[] findBlank(int board[][]) {
		int blank[] = new int[2];
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				blank[0] = i;
				blank[1] = j;
				return blank;
			}
		}
		return null;
	}

}
