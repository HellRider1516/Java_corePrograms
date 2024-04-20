package in.mahesh;

import java.util.Scanner;

public class Patterns {
	
	public void pattern1(Integer num) {
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern2(Integer num) {
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public void pattern3(Integer num) {
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void pattern4(Integer num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		Patterns p = new Patterns();
		p.pattern1(num);
		p.pattern2(num);
		p.pattern3(num);
		p.pattern4(num);
		
	}
}
