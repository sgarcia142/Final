package Q7;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class NintendoCharacter implements Comparable<Object>{

	private Color color;
	private String name;
	
	public NintendoCharacter(Color outfitColor, String characterName) {
		this.color = outfitColor;
		this.name = characterName;
	}
	
	@Override
	public int compareTo(Object o) {
		return color.toString().compareTo(((NintendoCharacter)o).color.toString());
	}
	
	public String toString() {
		return name + " : " + color.toString();
	}
	
	public static void main(String[] args) {
		ArrayList<NintendoCharacter> characters = new ArrayList<NintendoCharacter>(); 
		
		NintendoCharacter m = new NintendoCharacter(Color.red, "Mario");
		NintendoCharacter l = new NintendoCharacter(Color.green, "Luigi");
		NintendoCharacter p = new NintendoCharacter(Color.magenta, "Princess Peach");
		
		characters.add(m);
		characters.add(l);
		characters.add(p);
		
		for(NintendoCharacter c: characters) {
			System.out.println(c);
		}
		
		Collections.sort(characters);
		
		for(NintendoCharacter c: characters) {
			System.out.println(c);
		}		
		
		
	}
	
}
