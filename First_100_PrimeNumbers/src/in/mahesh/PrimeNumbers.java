package in.mahesh;

import java.util.Scanner;

public class PrimeNumbers {
	int count=0;
	
	public void PrimeNumber(Integer num) {
		int n=1;
		
		for(int i=1;i<=num;i++) {
			if(n%i==0) {
				count++;
			}
			if(count==2) {
				count=0;
				System.out.print(i+",");
			}
			n++;
				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		PrimeNumbers pn=new PrimeNumbers();
		pn.PrimeNumber(num);
		
	}

}
