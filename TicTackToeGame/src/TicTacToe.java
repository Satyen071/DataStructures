import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	 static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		 
		 
		
		char[][] gameBoard = {{' ','|',' ','|',' '},
				  			  {'-','+','-','+','-'},
				  			  {' ','|',' ','|',' '},
				  			  {'-','+','-','+','-'},
				  			  {' ','|',' ','|',' '}};
		
		showGameBoard(gameBoard);
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your position 1-9");
			int pos = scan.nextInt();
			while(playerPositions.contains(pos)||cpuPositions.contains(pos)) {
				System.out.println("enter correct position");
				pos = scan.nextInt();
				
			}
			System.out.println(pos);
			
			placeYourPiece(gameBoard,pos,"player");
			String result = whoWon();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) +1;
			while(playerPositions.contains(cpuPos)||cpuPositions.contains(cpuPos)) {
				cpuPos=rand.nextInt(9)+1;
			}
			placeYourPiece(gameBoard,cpuPos,"CPU");
			showGameBoard(gameBoard);
			result = whoWon();
			if(result.length()>0) {
			System.out.println(result);
			break;
		}
			
		}
	}

	public static void showGameBoard(char [][] gameBoard) {
		for(char[] row:gameBoard) {
			for(char c:row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placeYourPiece(char[][] gameBoard,int pos,String user) {
		char symbol=' ';
		
		if(user.equals("player")) {
		symbol='X';	
		playerPositions.add(pos);
		}else if(user.equals("CPU")) {
			symbol='O';
			cpuPositions.add(pos);
		}
		
		
		switch(pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
			default:
				break;
		}
	}
	public static String whoWon() {
		
		List topRow= Arrays.asList(1,2,3);
		List midRow= Arrays.asList(4,5,6);
		List botRow= Arrays.asList(7,8,9);
		List leftCol= Arrays.asList(1,4,7);
		List midCol= Arrays.asList(2,5,8);
		List rightCol= Arrays.asList(3,6,9);
		List cross1= Arrays.asList(1,5,9);
		List cross2= Arrays.asList(3,5,7);
		 List<List> win = new ArrayList<List>();
		 win.add(topRow);
		 win.add(midRow);
		 win.add(botRow);
		 win.add(leftCol);
		 win.add(midCol);
		 win.add(rightCol);
		 win.add(cross1);
		 win.add(cross2);
		 for(List l:win) {
			 if(playerPositions.containsAll(l)) {
				 return "hey You won the game";
			 }else if(cpuPositions.containsAll(l)) {
				 return "looks like you lost to CPU";
				 
			 }else if(playerPositions.size()+cpuPositions.size()==9) {
				 return "Its a draw";
				 
			 }
		 }
		 
		return "";
	}
}
