package Q3;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

// Question 3
public class Forecast {
	public static void main(String[] args) {
		int numDays = 0;
		
		// Create ui for user input 
		Scanner ui = new Scanner(System.in);
	
		// Prompt User 
		System.out.println("Please enter the number of days to forecast:\n");
		
		// Validate proper user response 
		while(!ui.hasNextInt()) {
			System.out.println("That is not a proper response.  Please enter the number of days to forecast:\n");
			ui.next();
		}
		
		// Capture days to forecast
		numDays = ui.nextInt();
		
		// Exception handle 
		try {
			// Create file reader 
			Scanner fr = new Scanner(new File("data/forecast.txt"));
			// iterate over the file until number of days reached or the file runs out of lines 
			for(int i = numDays; i > 0 && fr.hasNextLine(); i--) {
				// display back to the user 
				System.out.println(fr.nextLine());
			}
			// clean up 
			fr.close();
		} catch (IOException e) {
			System.out.println("File Error");
		}
		// clean up
		ui.close();
	}
}
