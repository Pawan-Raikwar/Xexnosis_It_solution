package Xenosis;
import java.util.*;

public class BUILD_A_SIMPLE_TEXT_BASED_GAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		BUILD_A_SIMPLE_TEXT_BASED_GAME game;
		game=new BUILD_A_SIMPLE_TEXT_BASED_GAME();
		game.playerSetUp();
		
			
	}
	public void playerSetUp() {
		  int playerHP;
		  playerHP=15;
		  
		  String playerWeapon;
		  playerWeapon="Knige";
		  
		  System.out.println("Your HP :"+playerHP);
		//  System.out.println();
		  System.out.println("Your Weapon:"+playerWeapon);
		//  System.out.println();

		  
		  String playerName;
		  
		  Scanner myScanner=new Scanner(System.in);
		  
		  System.out.println("Please Enter Your Name :");
		  
		  playerName=myScanner.nextLine();
		  
		  System.out.println("Hello "+playerName+", let's start your adventure!");
		  
		   
		  
		  
	}

} 
