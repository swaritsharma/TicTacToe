import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

 interface gameInterface{
	public void welcomeScreen();
	public void playersInfo();
	public void gameLayout();
	public int winner();
	public void gameInput();
}

 class gameFunctions implements gameInterface{
 	public String player1, player2, player;
 	public char[] check = new char[10];
 	public int inputNumber=0; 
 	public char key;

 	gameFunctions(){//constructor
 		check[0]='z';
 		check[1]='a'; check[2]='b'; check[3]='c';
 		check[4]='d'; check[5]='e'; check[6]='f';
 		check[7]='g'; check[8]='h'; check[9]='i'; 
 	}
//welcome screen
	public void welcomeScreen(){
		System.out.println("\t.____________________.");	
	    System.out.println("\t|\t\t     |");
	    System.out.println("\t|   TIC - TAC -TOE   |");
	    System.out.println("\t|\t\t     |");
	    System.out.println("\t.____________________.");
	}
//Players name
	public void playersInfo(){
		Scanner pIn = new Scanner(System.in);
		
		System.out.print("\n     Enter the name of 1st player: "); player1 = pIn.nextLine();
		System.out.print("     Enter the name of 2nd player: "); player2 = pIn.nextLine();	
		System.out.println("\n	"+player1.toUpperCase()+"(X)   V/S   "+player2.toUpperCase()+"(O)\n");
	}

//Layout of the game
	public void gameLayout(){
		System.out.println("\t     |\t   |");
		System.out.println("\t  "+check[1]+"  |  "+check[2]+"  |  "+check[3]);
		System.out.println("\t_____|_____|_____");
		System.out.println("\t     |\t   |\t");
		System.out.println("\t  "+check[4] + "  |  " + check[5] +"  |  " + check[6]);
		System.out.println("\t_____|_____|_____ ");
		System.out.println("\t     |     |     ");
		System.out.println("\t  " + check[7] + "  |  " + check[8] + "  |  " +check[9]);
		System.out.println("\t     |\t   |\t\n");
	}


//Deciding the winner of the game
	public int winner(){

	    if((check[1]==check[2] && check[1]==check[3] && check[2]==check[3]) ||    //check rows
	        (check[4]==check[5] && check[4]==check[6] && check[5]==check[6])||
	        (check[7]==check[8] && check[7]==check[9] && check[8]==check[9])||

	        (check[1]==check[4] && check[1]==check[7] && check[4]==check[7])||  //check columns
	        (check[2]==check[5] && check[2]==check[8] && check[5]==check[8])||
	        (check[3]==check[6] && check[3]==check[9] && check[6]==check[9])||

	        (check[1]==check[5] && check[1]==check[9] && check[5]==check[9])||   //check diagonals
	        (check[3]==check[5] && check[3]==check[7] && check[5]==check[7])){
	        return 1;
	        }

	    else if (check[1] != 'a' && check[2] != 'b' && check[3] != 'c' && check[4] != 'd' && check[5] != 'e' && check[6] != 'f' && check[7] != 'g' && check[8] != 'h' && check[9] != 'i')
	        return -1;
	    else
	        return 0;
	}


//Running the game
	public void gameInput(){
		Scanner inO = new Scanner(System.in);
		        //changing the name while the players move

		    if(inputNumber%2==0){
			pos1: while(true){
				    player=player1;
				    System.out.print("\t   "+player+"'s Move:");
				    key = inO.next().charAt(0);

				     switch(key){
				case 'a':
				    if(check[1]!='O' && check[1]!='X' ){       //checks if you are entering the same values
				    check[1]='X';
				    break;}
				    else{
				        	System.out.println("\t   INVALID MOVE."); //for checking previously entered values
				        	continue pos1;
				        }

				    
				
				case 'b':
				    if(check[2]!='O' && check[2]!='X'){
				    check[2]='X';
				    break;}
				    else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'c':
				    if(check[3]!='O' && check[3]!='X'){
				        check[3]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'd':
				    if(check[4]!='O' && check[4]!='X'){
				        check[4]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
		
				case 'e':
				    if(check[7]!='O' && check[5]!='X'){
				        check[5]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'f':
				    if(check[8]!='O' && check[6]!='X'){
				        check[6]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'g':
				    if(check[7]!='O' && check[7]!='X'){
				        check[7]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'h':
				    if(check[8]!='O' && check[8]!='X'){
				        check[8]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }
				
				case 'i':
				    if(check[9]!='O' && check[9]!='X'){
				        check[9]='X';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos1;
				        }

				 
				default:
				    System.out.println("\t   INVALID MOVE.");
				    continue pos1;
				     }
		     break;
		 }
		      
		    }else if(inputNumber%2==1){
		    pos2:	while(true){
				    player=player2;
				    System.out.print("\t   "+player+"'s Move:");
				    key = inO.next().charAt(0);

				    switch(key){
				case 'a':
				    if(check[1]!='O' && check[1]!='X'){
				        check[1]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }


				
				case 'b':
				    if(check[2]!='O' && check[2]!='X'){
				        check[2]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'c':
				    if(check[3]!='O' && check[3]!='X'){
				        check[3]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'd':
				    if(check[4]!='O' && check[4]!='X'){
				        check[4]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'e':
				    if(check[5]!='O' && check[5]!='X'){
				        check[5]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'f':
				    if(check[6]!='O' && check[6]!='X'){
				        check[6]='O';
				        break;}
				        else{
				        	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'g':
				    if(check[7]!='O' && check[7]!='X'){
				        check[7]='O';
				    
				    break;}
				    else{
				    	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				}
				case 'h':
				    if(check[8]!='O' && check[8]!='X'){
				        check[8]='O';
				    
				    break;}
				    else{
				    	System.out.println("\t   INVALID MOVE.");
				        	continue pos2;
				        }
				
				case 'i':
				    if(check[9]!='O' && check[9]!='X'){
				        check[9]='O';
			
				    break;}
				    else{
				    	System.out.println("\t   INVALID MOVE.");
				        continue pos2;
				    }
				
				default:
				    System.out.println("\t   INVALID MOVE");
					continue pos2;
				    }
				    break;
				}
		      }

	}	
}



public class TicTacToe{
	public static void main(String args[]){
		Scanner mn= new Scanner(System.in);
		int playMore;
		int w=1;
		gameFunctions obj = new gameFunctions();
		obj.welcomeScreen();
		obj.playersInfo();
		
		do{                    //when game is running
			obj.gameLayout();
			do{
				obj.gameInput();
				obj.gameLayout();
				obj.winner();
				w = obj.winner();
				obj.inputNumber++;
			}while(w==0);

			if(w==1){               //somebody wins
				if(obj.inputNumber%2==1)
					System.out.println("\t   "+obj.player1+" Wins!");
				else if(obj.inputNumber%2==0)
					System.out.println("\t   "+obj.player2+" Wins!");
			}else if(w==-1){        //draw game
				System.out.println("\t   The Game is a Draw.");
			}

			//reseting values
			obj.check[0]='z';
	 		obj.check[1]='a'; obj.check[2]='b'; obj.check[3]='c';
	 		obj.check[4]='d'; obj.check[5]='e'; obj.check[6]='f';
	 		obj.check[7]='g'; obj.check[8]='h'; obj.check[9]='i';
	 		obj.inputNumber=0;
	 		System.out.println("Press 1 to play again and 2 to exit the game: "); playMore = mn.nextInt();
	 		System.out.println("\n");

			}while(playMore==1);

		if(playMore==2)
			System.out.println("\t   Goodbye!! Have a cheerful day.");
			else 
				System.out.println("\t   Goodbye!! Have a cheerful day.");	
		
	}
}