package Piece;
import java.awt.Color;

import Game.Board;
import Game.Square;
import MoveBehavior.QueenMove;

public class Queen extends Piece {
	
	public Queen() {
		// TODO Auto-generated constructor stub
	setMovementBehaviour(new QueenMove());
	}
	//instantiate piece as queen
	@Override
	public Queen initializePiece(Piece piece){
		return (Queen)piece;
	}
	//setting hint for queen to move
	public void setAvailability(Square p){
		move(p.getX(),p.getY());
		  }		
	
}

