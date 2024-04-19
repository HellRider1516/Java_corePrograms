package in.mahesh;

import java.util.Scanner;

public class Factorial {
	
	public void fact(Integer num) {
		int fact=1;
		for(int i= 1 ; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		Factorial f =new Factorial();
		f.fact(num);
	}

}
