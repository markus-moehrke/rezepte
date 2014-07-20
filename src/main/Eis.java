package main;

public class Eis implements IRezept, Comparable<IRezept> {
	
	private String name;
	
	public Eis(String name) {
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
