package FileStuff2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner in = null;
		int current = 0;
		try {
			in = new Scanner(new File("data/foo.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Foo.txt not found.");
			System.exit(1);
		}

		HashMap<Integer, String> set = new HashMap<Integer,String>();
		while(in.hasNext()) {
			String token = in.next().toLowerCase();
			set.put(current,token);
			current++;
		}
		
		for(int i = current-1; i >=0; i--) {
			System.out.println(set.get(i));
		}
	}
}
