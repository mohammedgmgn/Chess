package MoveBehavior;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Game.Board;
import Piece.Pawn;

public class PawnMove implements MovementBehaviour{

public PawnMove(){
	
 
}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		if(Board.player1.getPlayerTurn()){
			//check for piece is moved from its possessed place
		if(y==1){
			for(int i=1;i<=2;i++){
		if(Board.board[x][y+i].isOccupied())
	    {
	      
	       break;
	    }
		
	     Board.board[x][y+i].setHint(Color.yellow); 
		 
     }
			
			}
			else {
				if(!Board.board[x][y+1].isOccupied())
			    {
			      Board.board[x][y+1].setHint(Color.yellow);
			       
			    }
				
			     
			}
		//player 1  right up 
		if(((x+1)>=0&&(x+1)<8)&&((y+1)>=0&&(y+1)<8)){
		if(Board.board[x+1][y+1].isOccupied()){
			
		 if(!Board.board[x+1][y+1].getPiece().isWhite()){
			 Board.board[x+1][y+1].setHint(Color.yellow);
		 }
		
		}}
		//left down
		if(((x-1)>=0&&(x-1)<8)&&((y+1)>=0&&(y+1)<8)){
		if(Board.board[x-1][y+1].isOccupied()){
			
			 if(!Board.board[x-1][y+1].getPiece().isWhite()){
				 Board.board[x-1][y+1].setHint(Color.yellow);
			 }
			
			}
		
	}
		}
	
	else if(Board.player2.getPlayerTurn()){
		
		//check for piece is moved from its possessed place
		if(y==6){
			for(int i=1;i<=2;i++){
		if(Board.board[x][y-i].isOccupied())
	    {
	      
	       break;
	    }
		
	     Board.board[x][y-i].setHint(Color.yellow); 
		 
     }
			
			}
			else {
				if(!Board.board[x][y-1].isOccupied())
			    {
			      Board.board[x][y-1].setHint(Color.yellow);
			       
			    }
				
			     
			}
		//player 2 right and up
		if(((x-1)>=0&&(x-1)<8)&&((y-1)>=0&&(y-1)<8)){
		if(Board.board[x-1][y-1].isOccupied()){
			
		 if(Board.board[x-1][y-1].getPiece().isWhite()){
			 Board.board[x-1][y-1].setHint(Color.yellow);
		 }
		
		}}
		//player 2 left and up
		if(((x+1)>=0&&(x+1)<8)&&((y-1)>=0&&(y-1)<8)){
		if(Board.board[x+1][y-1].isOccupied()){
			
			 if(Board.board[x+1][y-1].getPiece().isWhite()){
				 Board.board[x+1][y-1].setHint(Color.yellow);
			 }
			
			}
		}
		
     }
		
	}
}
