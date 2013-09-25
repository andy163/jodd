package printf.jodd.com;

import jodd.format.Printf;

public class Test {

	public static void main(String[] args) {
		System.out.println("test jodd");
		System.out.println(Printf.str("%+i", 173)); 
		System.out.println(Printf.str("%s %s", new String[]{"one", "two"})); 
		   
	}
}
