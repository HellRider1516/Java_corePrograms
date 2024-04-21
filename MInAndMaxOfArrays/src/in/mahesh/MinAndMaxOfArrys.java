package in.mahesh;

public class MinAndMaxOfArrys {
	
	public void findMax() {
		int arr[]= {7,3,6,1,9,9,88,9,4,4,4};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
		
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("Maximun value of array is "+temp);
		
	}
	
	public void findMin() {
		int arr[]= {7,3,6,1,9,9,88,9,4,4,4,0};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
		
			if(temp>arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("minimum value of array is "+temp);
		
	}
	
	public static void main(String[] args) {
		MinAndMaxOfArrys mm= new MinAndMaxOfArrys();
		mm.findMax();
		mm.findMin();
	}

}
