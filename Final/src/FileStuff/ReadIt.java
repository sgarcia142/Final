package FileStuff;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadIt {
	public static void main(String[] args) {
		try {
			Scanner ui = new Scanner(System.in);
			System.out.println("How many days do you wish to forecast?");
			while(!ui.hasNextInt()) {
				System.out.println("That was not an integer dummy");
				System.out.println("How many days do you wish to forecast?");
				ui.next();
			}
			int daysToForecast = ui.nextInt();
			ui.close();
			Scanner fr = new Scanner(new File("data/forecast.txt"));
			while(fr.hasNextLine()) {
				System.out.println(fr.nextLine());
			}
			System.out.println(daysToForecast);
			fr.close();
		} catch (IOException e) {
			System.out.println("File issues:");
		}
	}
}
