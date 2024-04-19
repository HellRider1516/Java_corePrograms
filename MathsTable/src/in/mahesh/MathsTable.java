package in.mahesh;

import java.util.Scanner;

public class MathsTable {
	
	public void tables(Integer num) {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		MathsTable t=new MathsTable();
		t.tables(num);
	}

}
