import java.util.HashMap;

public class letter {
	public static void main(String args[]) {
		String p1 = "abcde";
		
		String result = new letter1().solution(p1);
	        
	    System.out.println(result);
	}
}



class letter1 {
	public String solution(String p) {
		 
       String ans = "";
       
       int m = p.length()/2;
       
       if(p.length()%2 ==0)
    	   ans = p.substring(m -1, m +1);
       else
    	   ans = Character.toString(p.charAt(m));
       
       return ans;
    }
}

class letter2 {
	public String solution(String p) {
		int ans = p.length();
		if(ans%2 ==1) {
			return p.substring(ans/2,ans/2 +1);
		}
		else {
			return p.substring(ans/2-1,ans/2+1);
		}
	}
}
