package in.mahesh;

import java.util.Scanner;

public class SumOfNumbers {
	
	public Integer Add(Integer num) {
		Integer sum;
		sum = (num*(num+1))/2;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num=sc.nextInt();
		
		SumOfNumbers s=new SumOfNumbers();
		Integer add = s.Add(num);
		System.out.println("Sum of numbers is "+add);
	}

}
