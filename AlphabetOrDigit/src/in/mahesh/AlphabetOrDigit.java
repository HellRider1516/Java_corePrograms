package in.mahesh;

import java.util.Scanner;

public class AlphabetOrDigit {
	
	public boolean checkAlphabetOrDigit(char val) {
		if(Character.isDigit(val)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character...");
		String num =sc.nextLine();
		char charAt = num.charAt(0);
		AlphabetOrDigit alphabetOrDigit=new AlphabetOrDigit();
		boolean status = alphabetOrDigit.checkAlphabetOrDigit(charAt);
		if(status) {
			System.out.println("given character is Number.....");
		}else {
			System.out.println("given character is Charcter.....");
		}
	}

}
