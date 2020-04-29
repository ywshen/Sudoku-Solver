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
		//int [] result = findBlank(board);
		PrintBoard(board);
		System.out.println("");
		solve(board);
		PrintBoard(board);
		//System.out.println(result[0]);
		//System.out.println(result[1]);
	}
	
	public static boolean solve(int[][] board)
	{
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				int[] pos = {row, col};
				if(board[row][col]==0)
				{
					for(int number=1;number<=9;number++)
					{
						if(valid(row, col, board, number))
						{
							board[row][col] = number;
							if(solve(board))
							{
								return true;
							}
							else
							{
								board[row][col] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean valid(int row, int col,int[][] board, int number)
	{
		//Row
		for(int i=0;i<9;i++)
		{
			if(board[row][i]==number)
			{
				return false;
			}
		}
		
		//Col
		for(int i=0;i<9;i++)
		{
			if(board[i][col]==number)
			{
				return false;
			}
		}
		
		//Box
		int r = row - row%3;
		int c = col - col%3;
		for(int i=r;i<r+3;i++)
		{
			for(int j=c;j<c+3;j++)
			{
				if(board[i][j]==number)
				{
					return false;
				}
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
				if (board[i][j] == 0) {
					blank[0] = i;
					blank[1] = j;
					return blank;
				}
			}
		}
		return null;
	}

}
