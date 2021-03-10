import java.io.*;
import java.lang.reflect.*;

public class Q2 {
	
	static boolean class_validator(String class_name) {
		
		try {
			Class cls = Class.forName(class_name); // obtain class from string
			 
			Field[] fields = cls.getDeclaredFields(); // get attributes
			
			for(Field f : fields) {
				if(Modifier.isPrivate(f.getModifiers())) { // if contains private : true
					return true;
				}
			}
			
		} catch(Exception e) { // catch any exceptions, i.e no class for given string exists
			e.printStackTrace(); // output exception
		}
		
		return false; // else : false
	}
	
	public static void main(String[] args) {
		System.out.println(class_validator("A")); // expected: true
		System.out.println(class_validator("B")); // expected: false
	}
}

class A  {
	private int a; // example true
}

class B {
	public int b; // example false
}