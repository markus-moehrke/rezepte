package main;

public class Muffin implements IRezept {
	
	private String name;
	
	public Muffin(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
