package MoveBehavior;

import java.awt.Color;

import Game.Board;

public class BishopMove implements MovementBehaviour {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=x-1,j=y+1;i>=0&&j<8;i--,j++)
		   {
			if(Board.board[i][j].isOccupied()){
				  if(Board.board[i][j].getPiece().isWhite()&&Board.player1.getPlayerTurn())
						break;
					if(!Board.board[i][j].getPiece().isWhite()&&Board.player2.getPlayerTurn())
						break;
					if(Board.player1.getPlayerTurn()&&!Board.board[i][j].getPiece().isWhite()){
						Board.board[i][j].setHint(Color.yellow);
						break;
					}
	            if(Board.player2.getPlayerTurn()&&Board.board[i][j].getPiece().isWhite()){
	            	Board.board[i][j].setHint(Color.yellow);	
	            	break;
					}
	            }
		     Board.board[i][j].setHint(Color.yellow); 
		   }
		    
		  
		   //up and left
		  for(int i=x-1,j=y-1;i>=0&&j>=0;i--,j--)
		  {
			  if(Board.board[i][j].isOccupied()){
				  if(Board.board[i][j].getPiece().isWhite()&&Board.player1.getPlayerTurn())
						break;
					if(!Board.board[i][j].getPiece().isWhite()&&Board.player2.getPlayerTurn())
						break;
					if(Board.player1.getPlayerTurn()&&!Board.board[i][j].getPiece().isWhite()){
						Board.board[i][j].setHint(Color.yellow);
						break;
					}
	            if(Board.player2.getPlayerTurn()&&Board.board[i][j].getPiece().isWhite()){
	            	Board.board[i][j].setHint(Color.yellow);	
	            	break;
					}
	            }
		    Board.board[i][j].setHint(Color.yellow); 
		  }
		  
		  
		  //down and right
		  for(int i=x+1,j=y+1;i<8&&j<8;i++,j++)
		  {
			  if(Board.board[i][j].isOccupied()){
			  if(Board.board[i][j].getPiece().isWhite()&&Board.player1.getPlayerTurn())
					break;
				if(!Board.board[i][j].getPiece().isWhite()&&Board.player2.getPlayerTurn())
					break;
				if(Board.player1.getPlayerTurn()&&!Board.board[i][j].getPiece().isWhite()){
					Board.board[i][j].setHint(Color.yellow);
					break;
				}
            if(Board.player2.getPlayerTurn()&&Board.board[i][j].getPiece().isWhite()){
            	Board.board[i][j].setHint(Color.yellow);	
            	break;
				}
            }
		    Board.board[i][j].setHint(Color.yellow); 
		  }
		   
		  
		  //down and left
		  for(int i=x+1,j=y-1;i<8&&j>=0;i++,j--)
		  {if(Board.board[i][j].isOccupied()){
			  if(Board.board[i][j].getPiece().isWhite()&&Board.player1.getPlayerTurn())
					break;
				if(!Board.board[i][j].getPiece().isWhite()&&Board.player2.getPlayerTurn())
					break;
				if(Board.player1.getPlayerTurn()&&!Board.board[i][j].getPiece().isWhite()){
					Board.board[i][j].setHint(Color.yellow);
					break;
				}
            if(Board.player2.getPlayerTurn()&&Board.board[i][j].getPiece().isWhite()){
            	Board.board[i][j].setHint(Color.yellow);	
            	break;
				}
            }
		    Board.board[i][j].setHint(Color.yellow); 
		  }
		  

	}

}
