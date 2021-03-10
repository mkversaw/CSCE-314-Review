import java.util.*;

public class Player {
	// Some attributes, constructors, methods, etc. defined here
	Player() { }
	public boolean isAlive() {
		//... This returns true if the player is alive
	}
	public Move getMove() {
		//... This gets a move from a user
	}
	public int getResult(Move nextmove) {
		//... This returns the number of trophies the move resulted in
	}
	public void awardTrophies(int numtrophies) {
		// PROBLEM B code will go here
	}
}

//THIS IS FOR THE HEADER LINE FOR THE Manager CLASSS (Question C.i)
// Some attributes, constructors, methods, etc. defined here
Manager() { 
	public void awardBonus() {
		// ... causes there to be some bonus activated in the game
	}
	
	public void run() {
		// CODE FOR PART C.ii GOES HERE
	}
	
}


public class Main {
	// These can be accessed from other functions as Main.mylock,
	// Main.cond, Main.trophies
	final public static Lock mylock = new ReentrantLock();
	final public static Condition cond = mylock.newCondition();
	public static int trophies;
	
	public static void main(String[] args) {
		// This is a 2-player situation
		Player p1 = new Player();
		Player p2 = new Player();
		// Stuff here to initialize players
		Manager m = new Manager();
		// Stuff here to initialize game manager
		
		PlayerRunnable pr1 = new PlayerRunnable(p1);
		PlayerRunnable pr2 = new PlayerRunnable(p2);
		Thread t1 = new Thread(pr1);
		Thread t2 = new Thread(pr1);
		
		t1.start();
		t2.start();
		
		m.start();
	}
}