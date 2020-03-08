package game;

public class tic
{
	
	 private char[][] board;
	 private char currentMark;
	 
	 //Setting Value
	 tic()
	 {
		board= new char[3][3];
		currentMark='x';
		
	 }
	 
	 //Initialize board
	 void initBoard()
	 {
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 board[i][j]='-';
			 }
		 }
	 }
	 
	
	 //print borad
	 void printBoard()
	 {
		 System.out.println("-------");
		 for(int i=0;i<3;i++)
		 {
			 System.out.print("|");
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(board[i][j]+"|");
			 }
			 System.out.println();
		 }
		 System.out.println("-------");
	 }
	 
	 //Check board is full or not 
	 
	 boolean isBoardFull()
	 {
		 boolean full=true;
		 
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(board[i][j]=='-')
				 {
					 full=false;
					 break;
				 }
			 }
		 }
		 
		 return full;
	 }
	 
	 //Return CurrentMark on board 
	 
	 char getMark()
	 {		 
		 return currentMark;
	 }
	 
	 //check row column
	 boolean checkRowColumn(char c1,char c2, char c3 )
	 {
		 return (c1!='-')&&(c1==c2)&&(c2==c3);
	 }
	 
	 //check for rows
	 private boolean checkRows()
	 {
		 for(int i=0;i<3;i++)
		 {
			if(checkRowColumn(board[i][0], board[i][1], board[i][2])==true)
			{
				return true;
			}
		 }
		 return false;
	 }
	 
	 
	 //check for column
	 private boolean checkColumn()
	 {
		 for(int i=0;i<3;i++)
		 {
			if(checkRowColumn(board[0][i], board[1][i], board[2][i])==true)
			{
				return true;
			}
		 }
		 return false;
	 }
	 
	
	 
	 //check for diagonals
	 private boolean checkDiagonal()
	 {
		 if((checkRowColumn(board[0][0], board[1][1], board[2][2]) || checkRowColumn(board[2][0], board[1][1], board[0][2]))==true)
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 
	 //check for win
	 
	 boolean checkWin()
	 {
		return  (checkRows() || checkColumn() || checkDiagonal()) ;
	 }
	 
	 
	 //change player
	 
	 void changePlayer()
	 {
		 if(currentMark=='x')
			 currentMark='0';
		 else
			 currentMark='x';
	 }
	 
	 //place marks 
	 boolean placeMark(int rows, int col)
	 {
		 if(rows>=0 &&rows<3)
		 {
			 if(col>=0  && col<3)
			 {
				 if(board[rows][col]=='-')
				 {
					 board[rows][col]=getMark();
					 return true;
				 }
			 }
		 }
		 return false;
	 }

}
