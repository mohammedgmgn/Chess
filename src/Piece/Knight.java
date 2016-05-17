package Piece;


import java.awt.Color;

import Game.Board;
import Game.Square;
import MoveBehavior.KnightMove;

public class Knight extends Piece {

	public Knight() {
		// TODO Auto-generated constructor stub
		setMovementBehaviour(new KnightMove());
	}
	//instantiate piece as knight 
	@Override
	public Knight initializePiece(Piece piece){
		return (Knight)piece;
	}
	// setting hint for knight to move
	public void setAvailability(Square sq){
		
		move(sq.getX(),sq.getY());
	
	}
	
}

