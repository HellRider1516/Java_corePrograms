package in.mahesh;

public class SumOfArrays {
	
	public void sum() {
		int sum=0;
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of the Arrays is "+sum);
	}
	
	public static void main(String[] args) {
	
		SumOfArrays s= new SumOfArrays();
		s.sum();
	}

}
