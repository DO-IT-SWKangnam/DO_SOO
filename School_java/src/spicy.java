import java.util.PriorityQueue;

public class spicy {
	public static void main(String args[]) {
		int[] p1 = {1,2,3,9,10,12};
		int k = 7;
		
		int output = new spicy1().solution(p1, k);
		
		System.out.println(output);
	}
}

class spicy1 {
	public int solution(int[] p1, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// pq 선언
		for(int p : p1) {
			pq.add(p);
		}
		// pq 값 저장.
		int cnt = 0; 
		while(pq.peek() < k) {
			if(pq.size()<2)
				return -1;
			int mix = pq.poll() + (pq.poll()*2);
			pq.add(mix);
			cnt ++ ;
		}
		/*
		 * pq의 첫번째가 k보다 작을때 while문 반복, 
		 * pq의 size가 2보다 작을 경우 모든 값을 스코빌 지수보다 높게 만들수 없음으로 -1 반환
		 * mix 변수를 선언하고, pq의 가장 작은 값 + pq의 두번쨰 작은 값*2을 더해서 값선언 
		 * 위에서 만든 mix 값을 pq에 더하고 pq의 모든 값이 스코빌 지수보다 높을때까지 반복. 
		 */
		return cnt;
	}
}
