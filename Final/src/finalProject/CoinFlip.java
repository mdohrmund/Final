package finalProject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
public class CoinFlip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		int highScore = 0;
		do {
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		user = JOptionPane.showInputDialog(null,"Heads or tails? Or quit.. " + highScore);

		if(n == 1) 
		{
			if("Heads".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Heads. You win");
				highScore ++;
		}
			if("Tails".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Tails. You lose");
			}
		}
		if(n == 2) {
			if("Heads".equalsIgnoreCase(user)) {
				JOptionPane.showMessageDialog(null,"You picked Heads. You lose");
			}
			if("Tails".equalsIgnoreCase(user)) 
			{
				JOptionPane.showMessageDialog(null,"You picked Tails. You win");
				highScore ++;
			//Guess.main(args);	
			
//				Text File
				
//				try {
//					String file = null;
//					BufferedReader reader = new BufferedReader(new FileReader(file));
//				String line = reader.readLine();
//				while (line!= null)       
//				{
//					try {
//						int score = Integer.parseInt(line.trim());
//						if (score > highScore)
//						{
//							highScore = score;
//						}
//				} catch (NumberFormatException e1) {
//					
//				}
//					line = reader.readLine();	
//			}
//				reader.close();
//		} catch (IOException ex) {
//			System.err.println("ERROR reading scores from file");
//		}
			}
		
			}
		JOptionPane.showMessageDialog(null,"Your score is " + highScore);
	}while(highScore != 5);
		}	
		}

