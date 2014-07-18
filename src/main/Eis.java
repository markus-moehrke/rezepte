package main;

public class Eis implements IRezept {
	
	private String name;
	
	public Eis(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
