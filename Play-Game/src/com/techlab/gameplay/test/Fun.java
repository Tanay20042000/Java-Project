package com.techlab.gameplay.test;

public class Fun 
{
	public static final int X = 1, O = -1;
	public static final int EMPTY = 0;
		
	public int player = X;
	private int[][] b = new int[3][3];
	public boolean isEmpty = false;
		
	public void putSign(int x, int y)
	{
		if(x<0 || x>2 || y<0 || y>2)
		{
			System.out.println("Invalid b position");
			return;
		}
		if(b[x][y] != EMPTY)
		{
			System.out.println("b position occupied");
			return;
		}
		b[x][y] = player;
		player = -player;
	}
		
	public boolean isWin(int player)
	{
		return ((b[0][0] + b[0][1] + b[0][2] == player*3) ||
				(b[1][0] + b[1][1] + b[1][2] == player*3) ||
				(b[2][0] + b[2][1] + b[2][2] == player*3) ||
				(b[0][0] + b[1][0] + b[2][0] == player*3) ||
				(b[0][1] + b[1][1] + b[2][1] == player*3) ||
				(b[0][2] + b[1][2] + b[2][2] == player*3) ||
				(b[0][0] + b[1][1] + b[2][2] == player*3) ||
				(b[2][0] + b[1][1] + b[0][2] == player*3));
	}
		
	public void displayWinner()
	{
		if(isWin(X))
		{
			System.out.println("\n X wins...!!");
			isEmpty=false;
		}
		else if(isWin(O))
		{
			System.out.println("\n O wins...!!");
			isEmpty=false;
		}
		else
		{
			if(!isEmpty)
			{
				System.out.println("its a tie");
			}
				
		}
	}
		
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(b[i][j])
				{
				case X: 
					s.append(" X ");
					break;
				case O: 
					s.append(" O ");
					break;
				case EMPTY: 
					s.append("   ");
					isEmpty=true;
					break;
				}
				if(j<2)
				{
					s.append("|");
				}
					
			}
			if(i<2)
			{
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
}
