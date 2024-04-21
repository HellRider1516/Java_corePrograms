package in.mahesh;

public class SecondMinAndMaxOfArray {
	
	public void findSecondMax() {
		int arr[]= {7,3,6,1,9,9,8,9,4,4,4};
		int first=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(first < arr[i]) {
				second=first;
				first=arr[i];
			}else if(arr[i] > second && arr[i]!=first) {
				second=arr[i];
			}
		}
		
		System.out.println("Second largest element in array is "+second);
		
	}
	
	
	public void findSecondMin() {
		int arr[]= {7,3,6,1,9,9,8,9,4,4,4};
		int first=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(first > arr[i]) {
				second=first;
				first=arr[i];
			}else if(arr[i] < second && arr[i]!=first) {
				second=arr[i];
			}
		}
		
		System.out.println("Second min element in array is "+second);
		
	}
	
	
	public static void main(String[] args) {

		SecondMinAndMaxOfArray smm= new SecondMinAndMaxOfArray();
		smm.findSecondMax();
		smm.findSecondMin();
	}

}
