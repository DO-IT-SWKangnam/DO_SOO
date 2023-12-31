import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1912 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(dp(arr));
    }

    private static int dp(int[] arr) {
        int[] dp = new int[arr.length];
        
        dp[0] = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}

/*
 * bottom-up 방식
 * dp[i] 에 dp[i-1]+arr[i]와 arr[i]중 더 큰 값을 넣음. 
 * dp[i]를 출력. 
 */
