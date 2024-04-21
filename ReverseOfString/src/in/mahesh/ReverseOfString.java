package in.mahesh;

public class ReverseOfString {
	
	public void reverseString() {
		String s="Mahesh Reddy";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	
	
	public void reverseString1() {
		StringBuffer sb =new StringBuffer("Mahesh Reddy");
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}
	
	
	
	public static void main(String[] args) {
		ReverseOfString rs= new ReverseOfString();
		rs.reverseString();
		rs.reverseString1();
		
	}

}
