import java.util.HashMap;

public class hash {
	public static void main(String args[]) {
		 String[] p = {"leo", "kiki", "eden"};
	        String[] c = {"eden", "kiki"};
	        String result = new Marathon().solution(p, c);
	        
	        System.out.println(result);
	    }
	}

	 class Marathon {
	 public String solution(String[] p, String[] c) {
		 
	        String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : p) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : c) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	                break;
	            }
	        }
	        return answer;

	    }
}
	 
	 /*
	  * 이중 포문 해결 방법
	  * String ans = " ";
		 	
		 	HashMap<String, Integer> hm = new HashMap<>();
		 	
		 	for(String pla: p)
		 		hm.put(pla,hm.getOrDefault(pla, 0) +1);
		 	for(String pla: c)
		 		hm.put(pla,hm.get(pla)-1);
		 	for(String key : hm.keySet())
		 		if(hm.get(key) != 0)
		 			ans = key;
		 	return ans;
	  */
	 
	 
	 
	 /*
	  * 정렬 후 일치하지 않는 값이 나오면 그 값을 출
	  *  // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다
        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                return participant[i];

        //3 마지막 사람
        return participant[participant.length-1];
    }
    */
