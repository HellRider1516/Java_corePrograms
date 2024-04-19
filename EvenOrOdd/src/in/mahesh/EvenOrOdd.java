package in.mahesh;

import java.util.Scanner;

public class EvenOrOdd {
	
	public boolean checkNumber(Integer num) {
		
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		Integer num =sc.nextInt();
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		boolean status = evenOrOdd.checkNumber(num);
		if(status) {
			System.out.println("Given Number is Even.....");
		}else {
			System.out.println("Given Number is Odd.....");
		}
	}
	

}
