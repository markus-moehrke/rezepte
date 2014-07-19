package main;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */

public class Rezeptverwaltung {
	
	private List<IRezept> rezepte;

	public Rezeptverwaltung() {
		this.rezepte = new ArrayList<>();
	}

	public boolean add(IRezept arg0) {
		return rezepte.add(arg0);
	}

	@Override
	public String toString() {
		StringBuffer text = new StringBuffer();
		text.append("Rezeptverwaltung\n[rezepte=\n"); 
		
		for (IRezept rez : rezepte) {
			text.append(rez.getName() + "\n");
		}
//				rezepte + 
		text.append("]");
		
		return text.toString();
	}

}
