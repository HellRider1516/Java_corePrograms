package in.mahesh;

import java.util.Scanner;

public class DivisibleByNum {
	
	public boolean checkDivisibility(Integer num) {
		if(num%5==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		Integer num =sc.nextInt();
		DivisibleByNum check= new DivisibleByNum();
		boolean status = check.checkDivisibility(num);
		if(status) {
			System.out.println("Given Number is divisible by 5.....");
		}else {
			System.out.println("Given Number is not divisible by 5.....");
		}
	}

}
