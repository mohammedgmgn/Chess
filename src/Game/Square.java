package Game;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Piece.Bishop;
import Piece.King;
import Piece.Knight;
import Piece.Pawn;
import Piece.Piece;
import Piece.Queen;
import Piece.Rook;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
public class Square{
	//label
private JLabel square=new JLabel();
 //check for the occupation of the label
private boolean occupied=false;
// for mouse handling
public  MouseHandler handler = new MouseHandler();
 //the piece 
private Piece piece ;
//its indices on the Matrix board[][]
private int x,y;
//color of square
public Color old;

public Square(int x,int y){
	this.x=x;
	this.y=y;
}

//drawing the Field
public void drawField(int x,int y,Color c){
	square.setBounds(x, y, 75, 75);
	square.setBackground(c);
	old=c;
	square.setOpaque(true);
	
}
//setting the hint for possible moves for each piece
public void setHint(Color c){
	
	square.setBackground(c);
	square.repaint();
}
//setting the old color of the square
public void setOldColor(){
	square.setBackground(old);
	square.repaint();
}
// returning the label
public JLabel getLabel(){
	return square;
}
//setter and getter for the piece
public Piece getPiece(){
	return piece;
}
public void setPiece(Piece piece){
	
	this.piece=piece;
}
//initialize piece as piece
public Piece getInitPiece(){
	
	return new Piece();
}

public void setXandY(int x , int y){
	this.x=x;
	this.y=y;
}

public int getX(){
	return x;
}
public int getY(){
	return y;
}
//setting and getting the occupation status
public boolean isOccupied(){
	
	if(getPiece()!=null){
	 occupied=true;
	}
	else 
		 occupied=false;
	return occupied;
}
//promotion for the pawn to another piece 
public void promote(){
	//player 1
	if(Board.player1.getPlayerTurn()&&y==7){
		if(piece instanceof Pawn){
			
	
	String[] pieces = {"Rook","Knight","Bishop","Queen"};
	final JList list = new JList(pieces);
	final JFrame jf = new JFrame("Choose a piece");
     list.setVisibleRowCount(4);
     //add the list in a scroll window  
	jf.add(new JScrollPane(list));
	jf.setSize(120, 120);
	//positioning
	jf.setLocationRelativeTo(null);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
	//setting the selection type 
	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	//selecting from the list and handling selection listener
	list.addListSelectionListener(new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			if(list.getSelectedIndex()==0){
				piece=(new Rook());
				
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookwhite.png");
					square.setIcon(piece.getImage());
					square.repaint();
				
			
			}
			else if(list.getSelectedIndex()==1){
			piece=new Knight();	
			
				piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightwhite.png");
				square.setIcon(piece.getImage());
				square.repaint();
			
			
			}
			else if(list.getSelectedIndex()==2){
				piece=(new Bishop());
				
				
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopwhite.png");
					square.setIcon(piece.getImage());
					
					
					square.repaint();
				
				
			}
			else if(list.getSelectedIndex()==3){
				piece=(new Queen());
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/queenwhite.png");
					square.setIcon(piece.getImage());
					square.repaint();
				
				
			}
			
			piece.setBlackOrWhite(true);
			//to close the form after selection and continue
			jf.dispose();
		}
		
	});
		}
		}
	//player 2
	if(Board.player2.getPlayerTurn()&&y==0){
	
		if(piece instanceof Pawn){
			final JFrame jf2 = new JFrame("Choose a piece");
	
	String[] pieces2 = {"Rook","Knight","Bishop","Queen"};
	final JList list2 = new JList(pieces2);
	
     list2.setVisibleRowCount(4);
	jf2.add(new JScrollPane(list2));
	jf2.setSize(100, 100);
	jf2.setLocationRelativeTo(null);
	jf2.setVisible(true);
	jf2.setDefaultCloseOperation(jf2.DO_NOTHING_ON_CLOSE);
	//
	list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	//
	list2.addListSelectionListener(new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			if(list2.getSelectedIndex()==0){
				piece=(new Rook());
				
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/rookblack.png");
					square.setIcon(piece.getImage());
					square.repaint();
				
			
			}
			else if(list2.getSelectedIndex()==1){
			piece=new Knight();	
			
				piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/knightblack.png");
				square.setIcon(piece.getImage());
				square.repaint();
			
			
			}
			else if(list2.getSelectedIndex()==2){
				piece=(new Bishop());
				
				
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/bishopblack.png");
					square.setIcon(piece.getImage());
					System.out.print(piece.isWhite());
					
					square.repaint();
				
				
			}
			else if(list2.getSelectedIndex()==3){
				piece=(new Queen());
				
					piece.setImage("C:/Users/Mahmoud/workspace/Chess/Drawable/queenblack.png");
					square.setIcon(piece.getImage());
					square.repaint();
				
				
			}
			
			piece.setBlackOrWhite(false);
			jf2.dispose();
		}
		
	});
		}
		}
	
			
}

public void castling(){
	if(Board.player1.getPlayerTurn())
	{


	if(Board.board[0][0].getPiece() instanceof Rook && piece instanceof King)
	{
		if(!((Rook) (Board.board[0][0].getPiece())).isPlayed()&&!(((King)piece).isPlayed()))
		{
			if(!Board.board[1][0].isOccupied()&&!Board.board[2][0].isOccupied()&&!Board.board[3][0].isOccupied())
			{
				Board.board[2][0].getLabel().setBackground(Color.yellow);
			}
		}
	}
	
	 if(Board.board[7][0].getPiece() instanceof Rook && piece instanceof King)
	{
		if(!((Rook) (Board.board[7][0].getPiece())).isPlayed()&&!(((King)piece).isPlayed()))
		{
			if(!(Board.board[5][0].isOccupied())&&!(Board.board[6][0].isOccupied()))
			{
				Board.board[6][0].getLabel().setBackground(Color.yellow);
			
			}
		}
	}
	}
	else if(Board.player2.getPlayerTurn())
	{


	if(Board.board[0][7].getPiece() instanceof Rook && piece instanceof King)
	{
		if(!((Rook) (Board.board[0][7].getPiece())).isPlayed()&&!(((King)piece).isPlayed()))
		{
			if(!Board.board[1][7].isOccupied()&&!Board.board[2][7].isOccupied())
			{
				Board.board[1][7].getLabel().setBackground(Color.yellow);
			}
		}
	}
	
	 if(Board.board[7][7].getPiece() instanceof Rook && piece instanceof King)
	{
		if(!((Rook) (Board.board[7][7].getPiece())).isPlayed()&&!(((King)piece).isPlayed()))
		{
			if(!(Board.board[4][7].isOccupied())&&!(Board.board[5][7].isOccupied())&&!(Board.board[6][7].isOccupied()))
			{
				Board.board[5][7].getLabel().setBackground(Color.yellow);
			
			}
		}
	}
	}
}


//inner class for mouse handling
private class MouseHandler extends MouseAdapter {

	

	public void mouseClicked(MouseEvent e){

	if(Board.player1.getPlayerTurn()){
	if(square.getBackground()!=Color.yellow){
		
		if(isOccupied()){
			if(piece.isWhite()){
				
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
		Board.board[i][j].setOldColor();
		square.setBackground(Color.magenta);
		System.out.println(piece.getClass().getName());
				
		square.repaint();
		piece.setAvailability(Square.this);
		if(piece instanceof King){
			castling();
			
		}
		Board.setSavPiece(piece);
		Board.oldX=x;
		Board.oldY=y;
		}
	}
	}
	else if(square.getBackground()==Color.yellow){
		if(isOccupied()){
			if(!piece.isWhite()){
	         	if(piece instanceof King ){
	         		JFrame jf = new JFrame("Player 1");
	         		Font font = new Font("sans-serif",Font.BOLD,34); 
	         		jf.setVisible(true);
	         		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	         		jf.setSize(500,260);
	         		jf.setLocationRelativeTo(null);
	         		JLabel text = new JLabel("Checkmate, you have won");
	         		text.setFont(font);
	         	    text.setHorizontalAlignment(JTextField.CENTER);
	         	    text.setForeground(Color.red);
	         		
	         		jf.add(text);
	         		
	         		return;
	         	}
	         		
				
				
				piece = Board.getSavPiece();
				
				
				
				square.setIcon(piece.getImage());
				piece.setX(Board.oldX);
				piece.setY(Board.oldY);
				Board.board[Board.oldX][Board.oldY].setPiece(null);
				Board.board[Board.oldX][Board.oldY].getLabel().setIcon(null);
				promote();
				Board.player1.setPlayerTurn(false);
				Board.player2.setPlayerTurn(true);
				
				
				}
	}
		else{
			piece = Board.getSavPiece();
			if(piece instanceof Rook)
				((Rook)piece).setIsPlayed(true);
			
			if(piece instanceof King){
				if(!(((King) piece).isPlayed())){
					
					if(x-Board.oldX==2){
					Board.board[5][0].getLabel().setIcon(Board.board[7][0].getPiece().getImage());
					Board.board[5][0].setPiece(Board.board[7][0].getPiece());
					Board.board[5][0].getPiece().setX(Board.board[7][0].getPiece().getX());
					Board.board[5][0].getPiece().setY(Board.board[7][0].getPiece().getY());
					Board.board[7][0].setPiece(null);
					Board.board[7][0].getLabel().setIcon(null);
					((King) piece).setIsPlayed(true);
					((Rook) Board.board[5][0].getPiece()).setIsPlayed(true);
					
				}
					else if(x-Board.oldX==-2) {
						Board.board[3][0].getLabel().setIcon(Board.board[0][0].getPiece().getImage());
						Board.board[3][0].setPiece(Board.board[0][0].getPiece());
						Board.board[3][0].getPiece().setX(Board.board[0][0].getPiece().getX());
						Board.board[3][0].getPiece().setY(Board.board[0][0].getPiece().getY());
						Board.board[0][0].setPiece(null);
						Board.board[0][0].getLabel().setIcon(null);
						((King) piece).setIsPlayed(true);
						((Rook) Board.board[3][0].getPiece()).setIsPlayed(true);
					}
					else{
						((King) piece).setIsPlayed(true);
					}
					
					}
			}
			
			square.setIcon(piece.getImage());
			piece.setX(Board.oldX);
			piece.setY(Board.oldY);
			Board.board[Board.oldX][Board.oldY].setPiece(null);
			Board.board[Board.oldX][Board.oldY].getLabel().setIcon(null);
			promote();
			Board.player1.setPlayerTurn(false);
			Board.player2.setPlayerTurn(true);
			
			
			square.repaint();
		}
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
		Board.board[i][j].setOldColor();
		
			}

	}
	else if(Board.player2.getPlayerTurn()){
		if(square.getBackground()!=Color.yellow){
			if(isOccupied()){
				if(!piece.isWhite()){
			for(int i=0;i<8;i++)
				for(int j=0;j<8;j++)
			Board.board[i][j].setOldColor();
			square.setBackground(Color.magenta);
			square.repaint();
			piece.setAvailability(Square.this);
			if(piece instanceof King )
				castling();
			Board.setSavPiece(piece);
			Board.oldX=x;
			Board.oldY=y;
			}
		}
		}
		else if(square.getBackground()==Color.yellow){
			if(isOccupied()){
				if(piece.isWhite()){
					
					if(piece instanceof King ){
		         		JFrame jf = new JFrame("Player 2");
		         		Font font = new Font("sans-serif",Font.BOLD,34); 
		         		jf.setVisible(true);
		         		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		         		jf.setSize(500,260);
		         		jf.setLocationRelativeTo(null);
		         		JLabel text = new JLabel("Checkmate, you have won");
		         		text.setFont(font);
		         		text.setHorizontalAlignment(JTextField.CENTER);
		         	    text.setForeground(Color.red);
		         		
		         		jf.add(text);
		         		return;
		         	}
			
					piece = Board.getSavPiece();
					
					square.setIcon(piece.getImage());
					piece.setX(x);
					piece.setY(y);
					Board.board[Board.oldX][Board.oldY].setPiece(null);
					Board.board[Board.oldX][Board.oldY].getLabel().setIcon(null);
					promote();	
					Board.player2.setPlayerTurn(false);
					Board.player1.setPlayerTurn(true);	
					
					
				}
		}
			else{
				piece = Board.getSavPiece();
				if(piece instanceof Rook)
					((Rook)piece).setIsPlayed(true);
				
				if(piece instanceof King){
					if(!(((King) piece).isPlayed())){
						
						if(x-Board.oldX==2){
						Board.board[4][7].getLabel().setIcon(Board.board[7][7].getPiece().getImage());
						Board.board[4][7].setPiece(Board.board[7][7].getPiece());
						Board.board[4][7].getPiece().setX(Board.board[7][7].getPiece().getX());
						Board.board[4][7].getPiece().setY(Board.board[7][7].getPiece().getY());
						Board.board[7][7].setPiece(null);
						Board.board[7][7].getLabel().setIcon(null);
						((King) piece).setIsPlayed(true);
						((Rook) Board.board[4][7].getPiece()).setIsPlayed(true);
						
					}
						else if(x-Board.oldX==-2) {
							Board.board[2][7].getLabel().setIcon(Board.board[0][7].getPiece().getImage());
							Board.board[2][7].setPiece(Board.board[0][7].getPiece());
							Board.board[2][7].getPiece().setX(Board.board[0][7].getPiece().getX());
							Board.board[2][7].getPiece().setY(Board.board[0][7].getPiece().getY());
							Board.board[0][7].setPiece(null);
							Board.board[0][7].getLabel().setIcon(null);
							((King) piece).setIsPlayed(true);
							((Rook) Board.board[2][7].getPiece()).setIsPlayed(true);
						}
						else{
							((King) piece).setIsPlayed(true);
						}
						
						}
				}
				square.setIcon(piece.getImage());
				piece.setX(Board.oldX);
				piece.setY(Board.oldY);
				Board.board[Board.oldX][Board.oldY].setPiece(null);
				Board.board[Board.oldX][Board.oldY].getLabel().setIcon(null);
				promote();
				Board.player2.setPlayerTurn(false);
				Board.player1.setPlayerTurn(true);
				
				square.repaint();
				
			}
			for(int i=0;i<8;i++)
				for(int j=0;j<8;j++)
			Board.board[i][j].setOldColor();
			
		
			
				}
}

	}


	
}
}
