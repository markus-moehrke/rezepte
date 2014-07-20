package main;

public class Waffel implements IRezept, Comparable<IRezept> {

	private String name;
	
	public Waffel(String name) {
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
