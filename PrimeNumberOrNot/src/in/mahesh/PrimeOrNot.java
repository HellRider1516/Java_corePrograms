package in.mahesh;

import java.util.Scanner;

public class PrimeOrNot {
	
	int count=0;
	
	public Integer checkPrimeOrNot(Integer num) {
		for(int i=2 ; i<=num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		PrimeOrNot p= new PrimeOrNot();
		Integer checkPrimeOrNot = p.checkPrimeOrNot(num);
		if(checkPrimeOrNot ==1) {
			System.out.println("Given Number Is Prime Number.....");
		}else {
			System.out.println("Given Number Is not a Prime Number.....");
		}
		
		
	}
	

}
