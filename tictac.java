package game;

import java.util.Scanner;

public class tictac {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		tic obj = new tic();
		int ch;
		
		System.out.println("Tic-Tac-Toe Game !");
		do
		{
			obj.initBoard();
		do
		{
		
			obj.printBoard();
			int row,col;
			
			do
			{
			System.out.println("\n Get current player mark  "+obj.getMark()+" \nPlease enter mark on row and column ");
			row=sc.nextInt()-1;
			col=sc.nextInt()-1;
			}while(!obj.placeMark(row,col));
			obj.changePlayer();
			
		}while(!obj.checkWin() && !obj.isBoardFull());
		
		if(!obj.checkWin() && obj.isBoardFull())
		{
			System.out.println("\n Match is tie !");
		}
		else
		{
			System.out.println("Board : \n");
			obj.printBoard();
			obj.changePlayer();
			System.out.println(Character.toUpperCase(obj.getMark())+" Wins !");
		}
		System.out.println("\n Do you want to continue if yes then press 1!");
		obj.changePlayer();
		ch=sc.nextInt();
		}while(ch==1);
	}

}
