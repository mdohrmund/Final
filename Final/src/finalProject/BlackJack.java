package finalProject;
import java.util.Random;
import javax.swing.JOptionPane;
public class BlackJack { 
	
public static void main(String[]args) {

	
String user;
String draw;
String hit;
String choice;


		int howManyTimesYouBeatDealer;
	do {
		do {
			
			Random rand = new Random();
			int madi = rand.nextInt(13) + 1;
			draw = JOptionPane.showInputDialog(null, madi + ". \n1- Put 'draw' to draw another card\n2- Put 'two' when you have two cards");
			// keep track of their numbers!!!! ask them if they want a hit!!!! 
			// and honestly oh yeah and if they go over 21 end the game!!!!!!!!!
			// why didn't you just make a block comment
	        
			// alright make a way for it to keep score and by score i mean keep track of cards....... 
			// 
			

			//drawTotal = first + drawTotal;
			//++howManyTimesYouBeatDealer;
			//system.outstatement of howmany times you beat dealer
			//System Would you like to play again?
			//draw = input somthing draw
		   }while("draw".equalsIgnoreCase(draw) && equals 21 you win); 
choice = JOptionPane.showInputDialog(null, "Would you like to play again?");

		
	}while("yes".equalsIgnoreCase(choice));


	
		
	
}
	

	}
