package main;

public class RezeptverwaltungDemo {

	public static void main(String[] args) {
		
		Rezeptverwaltung r = new Rezeptverwaltung();
		r.add(new Muffin("Heidelbeermuffins"));
		r.add(new Waffel("Sonntagswaffeln"));
		r.add(new Eis("Erdbeereis"));

		System.out.println(r);
	}

}
