package Game;

import javax.swing.*;

import Piece.Piece;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Board  {
	
	//Matrix of the board
public static Square[][] board=new Square[8][8]; ;
private JLabel b=new JLabel();

//players
public static Player player1= new Player(true);
public static Player  player2=new Player(false);
//singleton
private static Board instance = null;
//saving 
private static Piece savPiece;
public static int oldX;
public static int oldY;
public static Piece getSavPiece(){
	return savPiece;
}
public static void setSavPiece(Piece piece){
 savPiece=piece;
}
//singleton
public static Board getInstance() {
	 
    if(instance == null) {
       instance = new Board();
    }
    return instance;
 }

//Form
private JFrame f = new JFrame();

//Initialize
private Board(){
	
	
initialize();

	//adding a label
	f.add(b);
	
	//form window size
	f.setSize(1000,1000);
	//What to do when the close clicked
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//set Background color	
	f.setBackground(Color.LIGHT_GRAY);
	//set Visibility of Form
	f.setVisible(true);
	
}
//initialize the board 
public void initialize(){
	
	
	for( int i=0,y=75;i<8;i++,y+=75){

		for( int j=0,x=375;j<8;j++,x+=75){
			
			
			if((i+j)%2==0){
			board[i][j].drawField(x,y , Color.LIGHT_GRAY);
			
			}		
			else {
				board[i][j].drawField(x,y , Color.GRAY);
				}
			
			
		
		}
	}
	
	
	for(int i=0;i<8;i++){

		for(int j=0;j<8;j++){
			
			//adding the labels on the form
			f.add(board[i][j].getLabel());
			//setting Mouse listener for each label
			board[i][j].getLabel().addMouseListener( board[i][j].handler);
			
		
		}
	}
	
}



}





