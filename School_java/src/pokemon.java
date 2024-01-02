import java.util.HashSet;

public class pokemon {
    public static void main(String[] args) {

        int[] p1 = {3,1,2,3};
        int output = new Solution().solution(p1);
        System.out.println(
                output
                //Arrays.stream(output).boxed().collect(Collectors.toList())
        );
    }
}

class pokemon1 {
	public int solution(int[] nums){
		
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i =0; i<nums.length; i++) {
			hs.add(nums[i]);
		}
		
		if(hs.size()>nums.length/2)
            return nums.length/2;
        return hs.size();

	}
}
