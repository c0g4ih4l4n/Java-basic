import java.lang.Math;
import java.util.ArrayList;

public class GuessGame {
	
	private Player p1, p2, p3;
	private int numberToGuess;
	
	public GuessGame() {
		this.p1 = new Player("Alice"); this.p2 = new Player("Bob"); this.p3 = new Player("Ceasar");
	}
	
	public void makeGuessNumber() {
		this.numberToGuess = (int) (Math.random() * 10);
	}
	
	public void askPlayerGuess() {
		this.p1.guess(); this.p2.guess(); this.p3.guess();
	}
	
	// find have winner or not
	public Boolean checkResult() {
		if (this.numberToGuess == this.p1.getNumberGuess() || 
			this.numberToGuess == this.p2.getNumberGuess() ||
			this.numberToGuess == this.p3.getNumberGuess()) {
			return true;
		} else {
			return false;
		}
	}
	
	// find List winners 
	public ArrayList<Player> findWinner() {
	
		ArrayList<Player> winners = new ArrayList<>();
		
		if (this.numberToGuess == this.p1.getNumberGuess())
			winners.add(this.p1);
		if (this.numberToGuess == this.p2.getNumberGuess())
			winners.add(this.p2);
		if (this.numberToGuess == this.p3.getNumberGuess())
			winners.add(this.p3);
			
		return winners;
	}
	
	// function Print The Result
	// Boolean haveWinner
	public void printResult(Boolean haveWinner) {
		System.out.println("Number to guess is " + this.numberToGuess);
		
		if (!haveWinner) {
			System.out.println(this.p1.getName() + " guess " + this.p1.getNumberGuess() + ".");
			System.out.println(this.p2.getName() + " guess " + this.p2.getNumberGuess() + ".");
			System.out.println(this.p3.getName() + " guess " + this.p3.getNumberGuess() + ".");
			System.out.println("No Player win !");
		} else {
			ArrayList<Player> winners = new ArrayList<Player>(this.findWinner());
			
			if (winners.size() == 1) {
				System.out.println("We have one winner !");
				System.out.println(winners.get(0).getName() + " ! Congratulation !!");
			} else {
				System.out.println("We have " + winners.size() + " winners !");
				for (Player winner : winners) {
					System.out.print(winner.getName() + " ");
				}
				System.out.println("Congratulations !");
			}
			
		}
	} // end method print Result
	
	public void startGame() {
		this.makeGuessNumber();
		this.askPlayerGuess();
		Boolean haveWinner = this.checkResult();
		this.printResult(haveWinner);
	}
}
