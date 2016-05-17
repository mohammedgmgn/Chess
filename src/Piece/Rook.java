package Piece;

import java.awt.Color;

import Game.Board;
import Game.Square;
import MoveBehavior.RookMove;

public class Rook extends Piece {
	
	//checking for the piece is on its initial position 
	private boolean firstPlayed;
	public Rook() {
		// TODO Auto-generated constructor stub
		setMovementBehaviour(new RookMove());
	}
	//setter and getter for the initial position check
		public void setIsPlayed(boolean b){
			firstPlayed=b;
		}
		public boolean isPlayed(){
			return firstPlayed;
		}
	//instantiate piece as rook
	@Override
	public Rook initializePiece(Piece piece){
		return (Rook)piece;
	}
	//setting hint for the rook to move
	public void setAvailability(Square p){
		move(p.getX(),p.getY());
}
		}
	

