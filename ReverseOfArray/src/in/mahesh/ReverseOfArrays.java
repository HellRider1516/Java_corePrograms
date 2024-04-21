package in.mahesh;

public class ReverseOfArrays {
	
	public void reverseArrys() {
		int arr[]= {1,2,3,4,5};
		System.out.print("The reverse of given Arrys is ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		ReverseOfArrays ra= new ReverseOfArrays();
		ra.reverseArrys();
	}

}
