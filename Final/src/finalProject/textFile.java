package finalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int highScore = 0;
		try {
			String file = null;
			BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		while (line!= null)       
		{
			try {
				int score = Integer.parseInt(line.trim());
				if (score > highScore)
				{
					highScore = score;
				}
		} catch (NumberFormatException e1) {
			
		}
			line = reader.readLine();	
	}
		reader.close();
} catch (IOException ex) {
	System.err.println("ERROR reading scores from file");
}
	}
}
