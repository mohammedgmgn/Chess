package MoveBehavior;
import java.awt.Color;

import Game.Board;

public class KnightMove implements MovementBehaviour {
@Override
public void move(int x, int y) {
 // TODO Auto-generated method stub
 //up right
 if(((x-1)>=0&&(x-1)<8)&&((y+2)>=0&&(y+2)<8)){
 //player1
 if(Board.board[x-1][y+2].isOccupied()&&Board.player1.getPlayerTurn())
 {
  if(!Board.board[x-1][y+2].getPiece().isWhite())
    Board.board[x-1][y+2].setHint(Color.yellow);    
 }
 //player2
 else if(Board.board[x-1][y+2].isOccupied()&&Board.player2.getPlayerTurn())
 {
  if(Board.board[x-1][y+2].getPiece().isWhite())
    Board.board[x-1][y+2].setHint(Color.yellow);
 }
 else
  Board.board[x-1][y+2].setHint(Color.yellow);
 }
  
 //up left
 if(((x+1)>=0&&(x+1)<8)&&((y+2)>=0&&(y+2)<8)){
 //player1
 if(Board.board[x+1][y+2].isOccupied()&&Board.player1.getPlayerTurn())
  {
  if(!Board.board[x+1][y+2].getPiece().isWhite())
   Board.board[x+1][y+2].setHint(Color.yellow);
  }
 //player2
 else if(Board.board[x+1][y+2].isOccupied()&&Board.player2.getPlayerTurn())
 {
  if(Board.board[x+1][y+2].getPiece().isWhite())
   Board.board[x+1][y+2].setHint(Color.yellow);    
 }
 else
  Board.board[x+1][y+2].setHint(Color.yellow);
 
 if(Board.board[x+1][y+2].isOccupied()&&Board.player1.getPlayerTurn()&&Board.board[x+1][y+2].getPiece().isWhite())
 {
  Board.board[x+1][y+2].setOldColor();
 }
 if(Board.board[x+1][y+2].isOccupied()&&Board.player2.getPlayerTurn()&&!Board.board[x+1][y+2].getPiece().isWhite())
 {
  Board.board[x+1][y+2].setOldColor();
 }
 }
 //down right
 if(((x-1)>=0&&(x-1)<8)&&((y-2)>=0&&(y-2)<8)){
 //player1
 if(Board.board[x-1][y-2].isOccupied()&&Board.player1.getPlayerTurn())
 {
  if(!Board.board[x-1][y-2].getPiece().isWhite())
    Board.board[x-1][y-2].setHint(Color.yellow);    
 }
 //player2
 else if(Board.board[x-1][y-2].isOccupied()&&Board.player2.getPlayerTurn())
   {
  if(Board.board[x-1][y-2].getPiece().isWhite())
   Board.board[x-1][y-2].setHint(Color.yellow);
  
   }
 else
  Board.board[x-1][y-2].setHint(Color.yellow);
 
 }
 //down left
 if(((x+1)>=0&&(x+1)<8)&&((y-2)>=0&&(y-2)<8)){
 //player1
 if(Board.board[x+1][y-2].isOccupied()&&Board.player1.getPlayerTurn())
  {if(!Board.board[x+1][y-2].getPiece().isWhite())
    Board.board[x+1][y-2].setHint(Color.yellow);}
 //player2
 else if(Board.board[x+1][y-2].isOccupied()&&Board.player2.getPlayerTurn())
 {
  if(Board.board[x+1][y-2].getPiece().isWhite())
   Board.board[x+1][y-2].setHint(Color.yellow);
 }
 else
  Board.board[x+1][y-2].setHint(Color.yellow);
 
 }
 //right up
 if(((x+2)>=0&&(x+2)<8)&&((y-1)>=0&&(y-1)<8)){
 //player1
 if(Board.board[x+2][y-1].isOccupied()&&Board.player1.getPlayerTurn())
 {
  if(!Board.board[x+2][y-1].getPiece().isWhite())
    Board.board[x+2][y-1].setHint(Color.yellow);    
 }
 //player2
 else if(Board.board[x+2][y-1].isOccupied()&&Board.player2.getPlayerTurn())
 {
  
  if(Board.board[x+2][y-1].getPiece().isWhite())
   Board.board[x+2][y-1].setHint(Color.yellow);
  
 }
 else
  Board.board[x+2][y-1].setHint(Color.yellow);
  
 }
 //right down
 if(((x+2)>=0&&(x+2)<8)&&((y+1)>=0&&(y+1)<8)){
 //player1
 if(Board.board[x+2][y+1].isOccupied()&&Board.player1.getPlayerTurn())
  {if(!Board.board[x+2][y+1].getPiece().isWhite())
    Board.board[x+2][y+1].setHint(Color.yellow);}
 //player2
 else if(Board.board[x+2][y+1].isOccupied()&&Board.player2.getPlayerTurn())
   {
  if(Board.board[x+2][y+1].getPiece().isWhite())
   Board.board[x+2][y+1].setHint(Color.yellow);
   }
 else
  Board.board[x+2][y+1].setHint(Color.yellow);
 
 }
 //left up
 if(((x-2)>=0&&(x-2)<8)&&((y-1)>=0&&(y-1)<8)){
  
 //player1
 if(Board.board[x-2][y-1].isOccupied()&&Board.player1.getPlayerTurn())
 {
  if(!Board.board[x-2][y-1].getPiece().isWhite())
    Board.board[x-2][y-1].setHint(Color.yellow);    
 }
 //player2
 else if(Board.board[x-2][y-1].isOccupied()&&Board.player2.getPlayerTurn())
 {
  if(Board.board[x-2][y-1].getPiece().isWhite())
   Board.board[x-2][y-1].setHint(Color.yellow);
 }
 else
  Board.board[x-2][y-1].setHint(Color.yellow);
  
 }
 //left down
 if(((x-2)>=0&&(x-2)<8)&&((y+1)>=0&&(y+1)<8)){
 //player1
 if(Board.board[x-2][y+1].isOccupied()&&Board.player1.getPlayerTurn())
  {if(!Board.board[x-2][y+1].getPiece().isWhite())
    Board.board[x-2][y+1].setHint(Color.yellow);}
 //player2
 else if(Board.board[x-2][y+1].isOccupied()&&Board.player2.getPlayerTurn())
 {
  if(Board.board[x-2][y+1].getPiece().isWhite())
   Board.board[x-2][y+1].setHint(Color.yellow); 
 }
 else
  Board.board[x-2][y+1].setHint(Color.yellow);
 
}

 
}
}