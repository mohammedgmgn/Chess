package MoveBehavior;

import java.awt.Color;

import Game.Board;

public class RookMove implements MovementBehaviour{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
		//right
		for(int i=x+1;i<8;i++)
		{
			if(Board.board[i][y].isOccupied()){
				if(Board.board[i][y].getPiece().isWhite()&&Board.player1.getPlayerTurn())
					break;
				if(!Board.board[i][y].getPiece().isWhite()&&Board.player2.getPlayerTurn())
					break;
				if(Board.player1.getPlayerTurn()&&!Board.board[i][y].getPiece().isWhite()){
					Board.board[i][y].setHint(Color.yellow);
					break;
				}
	            if(Board.player2.getPlayerTurn()&&Board.board[i][y].getPiece().isWhite()){
	            	Board.board[i][y].setHint(Color.yellow);	
	            	break;
				}
	            }
					Board.board[i][y].setHint(Color.yellow);	
		}
				
		
		//left
		for(int i=x-1;i>=0;i--)
		{
			if(Board.board[i][y].isOccupied()){
			if(Board.board[i][y].getPiece().isWhite()&&Board.player1.getPlayerTurn())
				break;
			if(!Board.board[i][y].getPiece().isWhite()&&Board.player2.getPlayerTurn())
				break;
			if(Board.player1.getPlayerTurn()&&!Board.board[i][y].getPiece().isWhite()){
				Board.board[i][y].setHint(Color.yellow);
				break;
			}
            if(Board.player2.getPlayerTurn()&&Board.board[i][y].getPiece().isWhite()){
            	Board.board[i][y].setHint(Color.yellow);	
            	break;
			}
            }
					Board.board[i][y].setHint(Color.yellow);		
		}
		
		
		//up
		for(int i=y+1;i<8;i++)
		{
			if(Board.board[x][i].isOccupied()){
			if(Board.board[x][i].getPiece().isWhite()&&Board.player1.getPlayerTurn())
				break;
			if(!Board.board[x][i].getPiece().isWhite()&&Board.player2.getPlayerTurn())
				break;
			if(Board.player1.getPlayerTurn()&&!Board.board[x][i].getPiece().isWhite()){
				Board.board[x][i].setHint(Color.yellow);
				break;
			}
            if(Board.player2.getPlayerTurn()&&Board.board[x][i].getPiece().isWhite()){
            	Board.board[x][i].setHint(Color.yellow);	
            	break;
			}
            }
				Board.board[x][i].setHint(Color.yellow);	
		}
			
		
		//down
		for(int i=y-1;i>=0;i--)
		{
			if(Board.board[x][i].isOccupied()){
				if(Board.board[x][i].getPiece().isWhite()&&Board.player1.getPlayerTurn())
					break;
				if(!Board.board[x][i].getPiece().isWhite()&&Board.player2.getPlayerTurn())
					break;
				if(Board.player1.getPlayerTurn()&&!Board.board[x][i].getPiece().isWhite()){
					Board.board[x][i].setHint(Color.yellow);
					break;
				}
	            if(Board.player2.getPlayerTurn()&&Board.board[x][i].getPiece().isWhite()){
	            	Board.board[x][i].setHint(Color.yellow);	
	            	break;
				}
	            }
			
				Board.board[x][i].setHint(Color.yellow);	
		}
			
	}

}
