import java.io.*;
import java.lang.reflect.*;

public class Q1 {
	
	static void printgreeting(Royalty king) {
		System.out.println(king.formal_name+" "+king.informal_name);
	}

	static void printgreeting(Lawyer lawyer) {
		System.out.println(lawyer.formal_name+" "+lawyer.informal_name);
	}
	
	static void printgreeting(Judge judge) {
		System.out.println(judge.formal_name+" "+judge.informal_name);
	}
	
	
	public static void main(String[] args) {
		Royalty king = new Royalty();
		Lawyer defender = new Lawyer("Vinny");
		Judge districtjudge = new Judge("Judy");
		king.setName("Arthur");
		printgreeting(king);
		printgreeting(districtjudge);
		printgreeting(defender);
	}
}

class Profession {
	String formal_name = null;
	String informal_name = null;
	
	void setName(String new_name) {
		informal_name = new_name;
	}
	
	String formal() {
		return formal_name;
	}
	
	String informal() {
		return informal_name;
	}
	
}

class Royalty extends Profession {
	
	String formal_name = "Your Highness";
	
	Royalty(){}
	
	Royalty(String new_name) {
		setName(new_name);
	}
	
}

class Lawyer extends Profession {
	
	String formal_name = "Attorney";
	
	Lawyer(){}
	
	Lawyer(String new_name) {
		setName(new_name);
	}
	
}

class Judge extends Lawyer {
	
	String formal_name = "Your Honor";
	
	Judge(){}
	
	Judge(String new_name) {
		setName(new_name);
	}
	
}

