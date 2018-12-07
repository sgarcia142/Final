package Q6;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Song {
	
	public static void main(String[] args) {
		ArrayList<String> lines = new ArrayList<String>();
		
		try {
			Scanner fr = new Scanner(new File("data/song.txt"));
			while(fr.hasNextLine()) {
				lines.add(fr.nextLine());
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("File Error");
		}
		
		for(int i = lines.size()-1; i >= 0; i--) {
			String line = lines.get(i);
			String reversedLine = "";
			for(int j = line.length()-1; j >= 0; j--) {
				reversedLine += line.charAt(j);
			}
			System.out.println(reversedLine);
		}
	}
	
}
