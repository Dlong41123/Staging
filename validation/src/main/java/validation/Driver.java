package validation;

import java.util.Scanner;

/*
 * Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
Examples
validate("121317") ➞ true

validate("1234") ➞ true

validate("45135") ➞ false

validate("89abc1") ➞ false

validate("900876") ➞ true

validate(" 4983") ➞ false

Notes:
Empty strings should return 'false' when tested. 
 */
public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean valid = false;
		while (valid = false) {
		System.out.println("Input Pin:");
		String input = sc.nextLine();
		while (input.isBlank()) {
			System.out.println("input cannot be blank");
			valid = false;
		}
		if (input.length()<4||input.length()>6) {
			System.out.println("Input must be minimum 4 characters in length and maximum of 6 characters in length");
			valid=false;
		}else if(!input.matches("[0-9]+")) {
			System.out.println("Input must only contain digits");
			valid=false;
		}else if(input.contains(" ")) {
			System.out.println("input must NOT contain spaces");
			valid=false;
		}else {
			valid=true;
			System.out.println("Valid input! : "+input);
		}
		}
	}

}
