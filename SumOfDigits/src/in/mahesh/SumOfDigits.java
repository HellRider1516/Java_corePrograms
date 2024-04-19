package in.mahesh;

import java.util.Scanner;

public class SumOfDigits {
	
	public void sumOfDigits(Integer num) {
		int n=num;
		int sum=0;
		while(num != 0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("sum Od digits of "+n+" is "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		SumOfDigits s= new SumOfDigits();
		s.sumOfDigits(num);
	}

}