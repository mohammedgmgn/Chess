package Game;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import Piece.Bishop;
import Piece.King;
import Piece.Knight;
import Piece.Pawn;
import Piece.Queen;
import Piece.Rook;

public class Player {
//TODO INITIALIZE PIECES
	
	private boolean playerTurn;
    int x,y;
	
	public Player(boolean b){
		
		for(int i=0;i<8;i++){

			for(int j=0;j<8;j++){
				
				Board.board[i][j]= new Square(i,j);
				
				
			
			}
		}
		
	playerTurn=b; 
	initialize();
	
		
		
		setPlayer1();
		
	    setPlayer2();
	}
	
	//initialize pieces on the board 
	private void initialize(){
		
		//pawn
		for(int i=0;i<8;i++){
			//player1
		
			Board.board[i][1].setPiece(Board.board[i][1].getInitPiece().initializePiece(new Pawn()));
			
			
			//player2
		
			Board.board[i][6].setPiece(Board.board[i][6].getInitPiece().initializePiece(new Pawn()));
			
			
		}
		//rook
		Board.board[0][0].setPiece(Board.board[0][0].getInitPiece().initializePiece(new Rook()));
		Board.board[0][7].setPiece(Board.board[0][7].getInitPiece().initializePiece(new Rook()));
		Board.board[7][0].setPiece(Board.board[7][0].getInitPiece().initializePiece(new Rook()));
		Board.board[7][7].setPiece(Board.board[7][7].getInitPiece().initializePiece(new Rook()));

		//Knight
		Board.board[1][0].setPiece(Board.board[1][0].getInitPiece().initializePiece(new Knight()));
		Board.board[1][7].setPiece(Board.board[1][7].getInitPiece().initializePiece(new Knight()));
		Board.board[6][7].setPiece(Board.board[6][7].getInitPiece().initializePiece(new Knight()));
		Board.board[6][0].setPiece(Board.board[6][0].getInitPiece().initializePiece(new Knight()));
		//Bishop
		Board.board[2][0].setPiece(Board.board[2][0].getInitPiece().initializePiece(new Bishop()));
		Board.board[2][7].setPiece(Board.board[2][7].getInitPiece().initializePiece(new Bishop()));
		Board.board[5][7].setPiece(Board.board[5][7].getInitPiece().initializePiece(new Bishop()));
		Board.board[5][0].setPiece(Board.board[5][0].getInitPiece().initializePiece(new Bishop()));
		
		//King
		Board.board[4][0].setPiece(Board.board[4][0].getInitPiece().initializePiece(new King()));
		Board.board[3][7].setPiece(Board.board[3][7].getInitPiece().initializePiece(new King()));
		
		//Queen
		Board.board[3][0].setPiece(Board.board[3][0].getInitPiece().initializePiece(new Queen()));
		Board.board[4][7].setPiece(Board.board[4][7].getInitPiece().initializePiece(new Queen()));



	}//setting player 1
	private void setPlayer1(){
		for(int i=0;i<8;i++){
			for(int j=0;j<2;j++){
				Board.board[i][j].getPiece().setBlackOrWhite(true);
			}
		}
		
		//pawn
		for(int i=0;i<8;i++){
			//player1
			
			Board.board[i][1].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/pawnwhite.png");
			Board.board[i][1].getLabel().setIcon(Board.board[i][1].getPiece().getImage());
				
		}
		//rook
		
		//player 1
		Board.board[0][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookwhite.png");
		Board.board[0][0].getLabel().setIcon(Board.board[0][0].getPiece().getImage());
		Board.board[7][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookwhite.png");
		Board.board[7][0].getLabel().setIcon(Board.board[7][0].getPiece().getImage());
			

		
		//knight
		
		//player 1
		Board.board[1][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightwhite.png");
		Board.board[1][0].getLabel().setIcon(Board.board[1][0].getPiece().getImage());
		Board.board[6][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightwhite.png");
		Board.board[6][0].getLabel().setIcon(Board.board[6][0].getPiece().getImage());

		
		//bishop
		
		//player 1
		Board.board[2][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopwhite.png");
		Board.board[2][0].getLabel().setIcon(Board.board[2][0].getPiece().getImage());
		Board.board[5][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopwhite.png");
		Board.board[5][0].getLabel().setIcon(Board.board[5][0].getPiece().getImage());


         //king
		
		//player 1
		Board.board[4][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/kingwhite.png");
		Board.board[4][0].getLabel().setIcon(Board.board[4][0].getPiece().getImage());
		


				//Queen
				
				//player 1
				Board.board[3][0].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/Queenwhite.png");
				Board.board[3][0].getLabel().setIcon(Board.board[3][0].getPiece().getImage());
			
		


	}
	//setting images for player 2
	private void setPlayer2(){
		for(int i=0;i<8;i++){
			for(int j=6;j<8;j++){
				Board.board[i][j].getPiece().setBlackOrWhite(false);
			}
		}
		//pawn
		for(int i=0;i<8;i++){
			
			//player2
		
			Board.board[i][6].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/pawnblack.png");
			Board.board[i][6].getLabel().setIcon(Board.board[i][6].getPiece().getImage());
		}
		//rook
	    //player 2
		Board.board[0][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookblack.png");
		Board.board[0][7].getLabel().setIcon(Board.board[0][7].getPiece().getImage());
		Board.board[7][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookblack.png");
		Board.board[7][7].getLabel().setIcon(Board.board[7][7].getPiece().getImage());
		
		//knight
		//player 2
		Board.board[1][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightblack.png");
		Board.board[1][7].getLabel().setIcon(Board.board[1][7].getPiece().getImage());
		Board.board[6][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightblack.png");
		Board.board[6][7].getLabel().setIcon(Board.board[6][7].getPiece().getImage());
		
		//bishop
		//player 2
		Board.board[2][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopblack.png");
		Board.board[2][7].getLabel().setIcon(Board.board[2][7].getPiece().getImage());
		Board.board[5][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopblack.png");
		Board.board[5][7].getLabel().setIcon(Board.board[5][7].getPiece().getImage());

         //king
         //player 2
				Board.board[3][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/kingblack.png");
				Board.board[3][7].getLabel().setIcon(Board.board[3][7].getPiece().getImage());

				//Queen
				//player 2
						Board.board[4][7].getPiece().setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/Queenblack.png");
						Board.board[4][7].getLabel().setIcon(Board.board[4][7].getPiece().getImage());


	}
	
	
	public   void setPlayerTurn(boolean b){
		playerTurn=b;
	}
	public boolean getPlayerTurn(){
		return playerTurn;
	}
}

	
	

