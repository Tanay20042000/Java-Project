package com.techlab.gameplay;
import java.util.Scanner;

import com.techlab.gameplay.test.Fun;
public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Fun f = new Fun();
		Scanner s = new Scanner(System.in);
		int x=0,y=0;
		do
		{
			System.out.println(f.player == f.X?"Player X turn":"Player O turn");
			System.out.println("ENTER x AND y PLACES");
			x=s.nextInt();
			y=s.nextInt();
				
			f.putSign(x, y);
			System.out.println(f.toString());
			System.out.println("_____________________________");
			f.displayWinner();
				
		}while(f.isEmpty);
	}
}
