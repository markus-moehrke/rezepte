package main;

public class Muffin implements IRezept, Comparable<IRezept> {
	
	private String name;
	
	public Muffin(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(IRezept o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String getName() {
		return name;
	}

}
