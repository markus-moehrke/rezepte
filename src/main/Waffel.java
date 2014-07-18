package main;

public class Waffel implements IRezept {

	private String name;
	
	public Waffel(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
