import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combination {
	public static void main(String args[]) {
		int[] p1 = {2,1,3,4,1};
		int[] output = new CombinationSolution().solution(p1);
		
		for (int num : output) {
            System.out.print(num + " ");
        }
	}
}

class CombinationSolution {
    public int[] solution(int[] p1) {
		
    	Set<Integer> s = new HashSet<>();
    	
    	for(int i =0; i<p1.length; i++) {
    		for(int j=i+1; j<p1.length; j++) {
    			s.add(p1[i] + p1[j]);
    		}
    	}
    	
    	List<Integer> l = new ArrayList<>(s);
    	l.sort(null);
    	
    	int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        
        
        
        /*
         * 다른 방법 
         *  int[] ans = new int[s.size()];
        	int i =0; 
        	for(int x : s) 	
        	ans[i++] = x;
        	Arrays.sort(ans);
         */
        
        return answer;
    }
}

