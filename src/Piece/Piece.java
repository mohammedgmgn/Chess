package Piece;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import Game.Square;
import MoveBehavior.MovementBehaviour;

public class Piece  {
	//Image
private ImageIcon imageIcon ;
  //Checking for white or black for the availability of kill
private boolean availableKill;
//Indices 
protected int x;
protected int y;



//for strategy pattern 

//For the movement of the piece due to the type of the piece 
private MovementBehaviour movementBehaviour;
 public void move(int i,int j){
     movementBehaviour.move(i,j);
    }
 public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
          this.movementBehaviour = movementBehaviour;
  
      }
//piece
public Piece(){
	
}


//checking for the movement of the piece and setting hint for the possible moves according to the piece
public void setAvailability(Square sq){


}
//setter and getter for the indices
public int getX(){
	return x;
	
}
public int getY(){
	return y;
}
public void setX(int x){
	this.x = x;
	
}
public void setY(int y){
	this.y= y;
}

//instantiate piece
public Piece initializePiece(Piece piece){

	return piece;
}
//setter and getter for the Image
public void setImage(String path){
	
	imageIcon=new ImageIcon(path);

}
public ImageIcon getImage(){
	return imageIcon;
}

//setter and getter for availability of kill and for the type of piece due to color 
public void setBlackOrWhite(boolean b){
	availableKill=b;
}
public boolean isWhite(){
	return availableKill;
}

}
