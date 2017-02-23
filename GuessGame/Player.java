import java.lang.Math;

public class Player {

	private String name;
	private int numberGuess;
	
	// constructor
	public Player(String name) {
		this.name = name;
	}
	
	// Getter Setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberGuess() {
		return this.numberGuess;
	}

	// main method
	public void guess() {
		this.numberGuess = (int) (Math.random() * 10);
	}
}
