import java.util.Arrays;

public class selection {
	public static void main(String args[]) {
		int[] p1 = {4,3,2,1};
		
		int[] output = new selection1().solution(p1);
		
		System.out.println(output);
	}
}


class selection1 {
	public int[] solution(int[] arr) {
		if(arr.length<=1)
			return new int[] {-1};		
		int min = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(i -> i !=min).toArray();
	}
}

class selection2 {
	public int[] solution(int[] arr) {
		if(arr.length<=1)
			return new int[] {-1};
		
		return Arrays.stream(arr)
				.filter(i -> i != Arrays.stream(arr)
				.min()
				.getAsInt())
				.toArray();
	}
		/*
		 * min값을 n번만큼 구함. filter에서 원소 갯수만큼 반복적으로 실행됨으로, 위의 코드보다
		 * 성능이 많이 떨어짐. 
		 */
}

class selection3 { 
	public int[] solution(int[] arr) {
		
		
		int[] ans = new int[arr.length -1];
		
		int min = Integer.MAX_VALUE;
		for(int i : arr) {
			min = Math.min(min, i);
		}
		
		int num = 0;
		for(int a : arr) {
			if(a == min) {
				continue;
			}
			else {
				ans[num++] = a;
			}
		}
		return ans;
		
	}
}