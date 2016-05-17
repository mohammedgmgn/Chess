package Piece;

import Game.Square;
import MoveBehavior.KingMove;

public class King extends Piece {
	
	//checking for the piece is on its initial position 
		private boolean firstPlayed;
	public King() {
		// TODO Auto-generated constructor stub
	setMovementBehaviour(new KingMove());
	
	}
	//setter and getter for the initial position check for castling
		public void setIsPlayed(boolean b){
			firstPlayed=b;
		}
		public boolean isPlayed(){
			return firstPlayed;
		}
		//instantiate the piece as king
	@Override
	public King initializePiece(Piece piece){
		return (King)piece;
	}
	//setting hint for the king to move 
	public void setAvailability(Square sq){
		move(sq.getX(),sq.getY());
		
	}

	
}

