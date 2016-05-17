package Piece;
import java.awt.*;

import Game.Board;
import Game.Square;
import MoveBehavior.BishopMove;
public class Bishop extends Piece {

	
	public Bishop() {
		// TODO Auto-generated constructor stub
		setMovementBehaviour(new BishopMove());
	}
	
	//instantiate piece as bishop
	@Override
	public Bishop initializePiece(Piece piece){
		return (Bishop) piece;
	}
	//setting hint for bishop to move
	public void setAvailability(Square sq){
		move(sq.getX(),sq.getY());
		
		
}
}
