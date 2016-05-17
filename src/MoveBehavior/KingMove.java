package MoveBehavior;

import java.awt.Color;

import Game.Board;

public class KingMove implements MovementBehaviour {

 @Override
 public void move(int x, int y) {
  // TODO Auto-generated method stub
  
       //forward and right
  
if(Board.player1.getPlayerTurn()){
	
	//player 1  right down 
			if(((x+1)>=0&&(x+1)<8)&&((y+1)>=0&&(y+1)<8)){
			if(Board.board[x+1][y+1].isOccupied()){
				
			 if(!Board.board[x+1][y+1].getPiece().isWhite()){
				 Board.board[x+1][y+1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x+1][y+1].isOccupied()) {
				 Board.board[x+1][y+1].setHint(Color.yellow);
			}
			}
			//right up
			if(((x-1)>=0&&(x-1)<8)&&((y+1)>=0&&(y+1)<8)){
			if(Board.board[x-1][y+1].isOccupied()){
				
				 if(!Board.board[x-1][y+1].getPiece().isWhite()){
					 Board.board[x-1][y+1].setHint(Color.yellow);
				 }
				
				}
			else if(!Board.board[x-1][y+1].isOccupied()) {
				 Board.board[x-1][y+1].setHint(Color.yellow);
			}
			}
			//player 1 left and up
			if(((x-1)>=0&&(x-1)<8)&&((y-1)>=0&&(y-1)<8)){
			if(Board.board[x-1][y-1].isOccupied()){
				
			 if(!Board.board[x-1][y-1].getPiece().isWhite()){
				 Board.board[x-1][y-1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x-1][y-1].isOccupied()) {
				 Board.board[x-1][y-1].setHint(Color.yellow);
			}
			}
			//player 1 left and down
			if(((x+1)>=0&&(x+1)<8)&&((y-1)>=0&&(y-1)<8)){
			if(Board.board[x+1][y-1].isOccupied()){
				
				 if(!Board.board[x+1][y-1].getPiece().isWhite()){
					 Board.board[x+1][y-1].setHint(Color.yellow);
				 }
				
				
			}
			else if(!Board.board[x+1][y-1].isOccupied()) {
				 Board.board[x+1][y-1].setHint(Color.yellow);
			}
			
	     }
			//player 1  right  
			if(((y+1)>=0&&(y+1)<8)){
			if(Board.board[x][y+1].isOccupied()){
				
			 if(!Board.board[x][y+1].getPiece().isWhite()){
				 Board.board[x][y+1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x][y+1].isOccupied()) {
				 Board.board[x][y+1].setHint(Color.yellow);
			}
			}
			//up
			if(((x-1)>=0&&(x-1)<8)){
			if(Board.board[x-1][y].isOccupied()){
				
				 if(!Board.board[x-1][y].getPiece().isWhite()){
					 Board.board[x-1][y].setHint(Color.yellow);
				 }
				
				}
			else if(!Board.board[x-1][y].isOccupied()) {
				 Board.board[x-1][y].setHint(Color.yellow);
			}
			}
			//player 1 left
			if(((y-1)>=0&&(y-1)<8)){
			if(Board.board[x][y-1].isOccupied()){
				
			 if(!Board.board[x][y-1].getPiece().isWhite()){
				 Board.board[x][y-1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x][y-1].isOccupied()) {
				 Board.board[x][y-1].setHint(Color.yellow);
			}
			}
			//player 1 down
			if(((x+1)>=0&&(x+1)<8)){
			if(Board.board[x+1][y].isOccupied()){
				
				 if(!Board.board[x+1][y].getPiece().isWhite()){
					 Board.board[x+1][y].setHint(Color.yellow);
				 }
				
				
			}
			else if(!Board.board[x+1][y].isOccupied()) {
				 Board.board[x+1][y].setHint(Color.yellow);
			}
			
	     }
			
}

else if(Board.player2.getPlayerTurn()){
	
	//player 2  right down 
			if(((x+1)>=0&&(x+1)<8)&&((y+1)>=0&&(y+1)<8)){
			if(Board.board[x+1][y+1].isOccupied()){
				
			 if(Board.board[x+1][y+1].getPiece().isWhite()){
				 Board.board[x+1][y+1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x+1][y+1].isOccupied()) {
				 Board.board[x+1][y+1].setHint(Color.yellow);
			}
			}
			//right up
			if(((x-1)>=0&&(x-1)<8)&&((y+1)>=0&&(y+1)<8)){
			if(Board.board[x-1][y+1].isOccupied()){
				
				 if(Board.board[x-1][y+1].getPiece().isWhite()){
					 Board.board[x-1][y+1].setHint(Color.yellow);
				 }
				
				}
			else if(!Board.board[x-1][y+1].isOccupied()) {
				 Board.board[x-1][y+1].setHint(Color.yellow);
			}
			}
			//player 2 left and up
			if(((x-1)>=0&&(x-1)<8)&&((y-1)>=0&&(y-1)<8)){
			if(Board.board[x-1][y-1].isOccupied()){
				
			 if(Board.board[x-1][y-1].getPiece().isWhite()){
				 Board.board[x-1][y-1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x-1][y-1].isOccupied()) {
				 Board.board[x-1][y-1].setHint(Color.yellow);
			}
			}
			//player 2 left and down
			if(((x+1)>=0&&(x+1)<8)&&((y-1)>=0&&(y-1)<8)){
			if(Board.board[x+1][y-1].isOccupied()){
				
				 if(Board.board[x+1][y-1].getPiece().isWhite()){
					 Board.board[x+1][y-1].setHint(Color.yellow);
				 }
				
				
			}
			else if(!Board.board[x+1][y-1].isOccupied()) {
				 Board.board[x+1][y-1].setHint(Color.yellow);
			}
			
	     }
			//player 2  right  
			if(((y+1)>=0&&(y+1)<8)){
			if(Board.board[x][y+1].isOccupied()){
				
			 if(Board.board[x][y+1].getPiece().isWhite()){
				 Board.board[x][y+1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x][y+1].isOccupied()) {
				 Board.board[x][y+1].setHint(Color.yellow);
			}
			}
			//up
			if(((x-1)>=0&&(x-1)<8)){
			if(Board.board[x-1][y].isOccupied()){
				
				 if(Board.board[x-1][y].getPiece().isWhite()){
					 Board.board[x-1][y].setHint(Color.yellow);
				 }
				
				}
			else if(!Board.board[x-1][y].isOccupied()) {
				 Board.board[x-1][y].setHint(Color.yellow);
			}
			}
			//player 2 left
			if(((y-1)>=0&&(y-1)<8)){
			if(Board.board[x][y-1].isOccupied()){
				
			 if(Board.board[x][y-1].getPiece().isWhite()){
				 Board.board[x][y-1].setHint(Color.yellow);
			 }
			
			}
			else if(!Board.board[x][y-1].isOccupied()) {
				 Board.board[x][y-1].setHint(Color.yellow);
			}
			}
			//player 2 down
			if(((x+1)>=0&&(x+1)<8)){
			if(Board.board[x+1][y].isOccupied()){
				
				 if(Board.board[x+1][y].getPiece().isWhite()){
					 Board.board[x+1][y].setHint(Color.yellow);
				 }
				
				
			}
			else if(!Board.board[x+1][y].isOccupied()) {
				 Board.board[x+1][y].setHint(Color.yellow);
			}
			
	     }
			
}

  
 }
 
 
 
 
 }
  
  
  
  
  
 /* 
   if(Board.board[x+1][y+1].isOccupied()&&Board.board[x+1][y+1].getPiece().isWhite())
   {
    if(Board.board[x+1][y+1].getPiece().isWhite()&&Board.player1.getPlayerTurn())
    {
              Board.board[x+1][y+1].setHint(Color.yellow); 

     
    }
     
    if(!Board.board[x+1][y+1].getPiece().isWhite()&&Board.player2.getPlayerTurn())

              Board.board[x+1][y+1].setHint(Color.yellow); 

             
             }
             
  
    
  /*
  //left
  
   if(Board.board[x-1][y].isOccupied()){
   if(Board.board[x-1][y].getPiece().isWhite()&&Board.player1.getPlayerTurn())

    if(!Board.board[x-1][y].getPiece().isWhite()&&Board.player2.getPlayerTurn())

     
     if(Board.player1.getPlayerTurn()&&!Board.board[x-1][y].getPiece().isWhite()){
    Board.board[x-1][y].setHint(Color.yellow);

     
     }
            if(Board.player2.getPlayerTurn()&&Board.board[x-1][y].getPiece().isWhite()){
             Board.board[x-1][y].setHint(Color.yellow); 

            
            }
            }
     Board.board[x-1][y].setHint(Color.yellow);  
  
  
  
  //up
   if(Board.board[x][y+1].isOccupied()){
   if(Board.board[x][y+1].getPiece().isWhite()&&Board.player1.getPlayerTurn())

    
    if(!Board.board[x][y+1].getPiece().isWhite()&&Board.player2.getPlayerTurn())

     
     if(Board.player1.getPlayerTurn()&&!Board.board[x][y+1].getPiece().isWhite()){
    Board.board[x][y+1].setHint(Color.yellow);

     }
            if(Board.player2.getPlayerTurn()&&Board.board[x][y+1].getPiece().isWhite()){
             Board.board[x][y+1].setHint(Color.yellow); 

            
            }
            }
    Board.board[x][y+1].setHint(Color.yellow); 
  
   
  
  //down
  
   if(Board.board[x][y-1].isOccupied()){
    if(Board.board[x][y-1].getPiece().isWhite()&&Board.player1.getPlayerTurn())

     
     if(!Board.board[x][y-1].getPiece().isWhite()&&Board.player2.getPlayerTurn())

      
      if(Board.player1.getPlayerTurn()&&!Board.board[x][y-1].getPiece().isWhite()){
     Board.board[x][y-1].setHint(Color.yellow);

      
      }
             if(Board.player2.getPlayerTurn()&&Board.board[x][y-1].getPiece().isWhite()){
              Board.board[x][y-1].setHint(Color.yellow); 

             }
             }
   
    Board.board[x][y-1].setHint(Color.yellow); 
    
  
     
   if(Board.board[x-1][y+1].isOccupied()){
      if(Board.board[x-1][y+1].getPiece().isWhite()&&Board.player1.getPlayerTurn())

       
       if(!Board.board[x-1][y+1].getPiece().isWhite()&&Board.player2.getPlayerTurn())

        
        if(Board.player1.getPlayerTurn()&&!Board.board[x-1][y+1].getPiece().isWhite()){
      Board.board[x-1][y+1].setHint(Color.yellow);


        }
             if(Board.player2.getPlayerTurn()&&Board.board[x-1][y+1].getPiece().isWhite()){
              Board.board[x-1][y+1].setHint(Color.yellow); 

     }
             }
       Board.board[x-1][y+1].setHint(Color.yellow); 
     
      
       
       
    
     //up and left
     if(Board.board[x-1][y-1].isOccupied()){
      if(Board.board[x-1][y-1].getPiece().isWhite()&&Board.player1.getPlayerTurn())
      {
       
       
      }
       
     if(!Board.board[x-1][y-1].getPiece().isWhite()&&Board.player2.getPlayerTurn())
      
     {
      
      
     }
     if(Board.player1.getPlayerTurn()&&!Board.board[x-1][y-1].getPiece().isWhite()){
      
      
      {
       Board.board[x-1][y-1].setHint(Color.yellow);
       
      }
     }
             if(Board.player2.getPlayerTurn()&&Board.board[x-1][y-1].getPiece().isWhite()){
              Board.board[x-1][y-1].setHint(Color.yellow);
              
              
     }
             }
      Board.board[x-1][y-1].setHint(Color.yellow); 
    
    
    
    //down and right
   
    
     if(Board.board[x+1][y+1].isOccupied()){
     if(Board.board[x+1][y+1].getPiece().isWhite()&&Board.player1.getPlayerTurn())
     
    if(!Board.board[x+1][y+1].getPiece().isWhite()&&Board.player2.getPlayerTurn())
    
    
    if(Board.player1.getPlayerTurn()&&!Board.board[x+1][y+1].getPiece().isWhite()){
     Board.board[x+1][y+1].setHint(Color.yellow);
     
    }
            if(Board.player2.getPlayerTurn()&&Board.board[x+1][y+1].getPiece().isWhite()){
             Board.board[x+1][y+1].setHint(Color.yellow); 
    }
            }
      Board.board[x+1][y+1].setHint(Color.yellow); 
    
     
    
    //down and left
    for(int i=x+1,j=y-1;i<8&&j>=0;i++,j--)
    {if(Board.board[x+1][y-1].isOccupied()){
     if(Board.board[x+1][y-1].getPiece().isWhite()&&Board.player1.getPlayerTurn())


      
      if(!Board.board[x+1][y-1].getPiece().isWhite()&&Board.player2.getPlayerTurn())


     if(Board.player1.getPlayerTurn()&&!Board.board[x+1][y-1].getPiece().isWhite()){
     Board.board[x+1][y-1].setHint(Color.yellow);
    }
            if(Board.player2.getPlayerTurn()&&Board.board[x+1][y-1].getPiece().isWhite()){
             Board.board[x+1][y-1].setHint(Color.yellow); 
    }
            }
      Board.board[x+1][y-1].setHint(Color.yellow); 
    }

    
*/
 
   
 