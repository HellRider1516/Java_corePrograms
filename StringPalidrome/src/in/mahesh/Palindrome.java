package in.mahesh;

public class Palindrome {
	
	public boolean checkPalidrome(String s) {
		StringBuffer sb =new StringBuffer(s);
		
		 String s1 = sb.reverse().toString();
		
		if(s.equals(s1)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean status = p.checkPalidrome("king");
		if(status) {
			System.out.println("Given String is Palidrome...");
		}else {
			System.out.println("Given String is not Palidrome...");
		}
		
	}

}
