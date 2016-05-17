package Piece;
import java.awt.*;
import javax.swing.ImageIcon;

import Game.Board;
import Game.Square;
import MoveBehavior.PawnMove;

 public class Pawn extends Piece {


	
	public Pawn() {
		// TODO Auto-generated constructor stub
		setMovementBehaviour(new PawnMove());
	}
	//setter and getter for the initial position check
	
	//instantiate the piece as pawn
	@Override
	public Pawn initializePiece(Piece piece){
		return (Pawn)piece;
	}
	//setting the hint for the pawn to move
	public void setAvailability(Square sq){
		
		
		move(sq.getX(),sq.getY());
	
		}
	
	}
	
	
	
	
	


