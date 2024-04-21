package in.mahesh;

public class RemoveThegivenChar {
	
	public void removeChar(String s , char c) {
		
		StringBuffer sb =new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)==c) {
				sb.deleteCharAt(i);
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void main(String[] args) {
		RemoveThegivenChar r= new RemoveThegivenChar();
		r.removeChar("my name is uppadi mahesh reddy", 'a');
	}
	
	

}
