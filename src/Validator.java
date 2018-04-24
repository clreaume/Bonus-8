import java.util.Scanner;

public class Validator {
	public static String getChoiceString(Scanner scan, String prompt, String s1, String s2) {
		String i = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNext(s1) || scan.hasNext(s2)) {
				i = scan.next();
				isValid = true;
			} else {
				System.out.println("Error! Invalid string value. Must enter " + s1 + " or " + s2 + ". Try again.");
			}
			scan.nextLine(); // discard any other data entered on the line
		
		}
		
		return i;
	
	}
}
