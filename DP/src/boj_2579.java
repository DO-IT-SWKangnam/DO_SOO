import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2579 {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(dp(arr, n));
    }
    
    private static int dp(int[] arr, int n) {
        int[] dp = new int[n+1];
        dp[1] = arr[1];
        if(n >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        
        for(int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
        }
        
        return dp[n];
    }
}

/*
 * bottom-up 
 * i-1 계단 안 밞고 바로 i번째 계단 가는 경우, i-1계단 밞고 i-2계단을 밞지 않고 i-3계단에서 두 계단올라서 i-1에 도착하는 경우
 * 위 2가지 사안을 비교하고 더 높은 값을 dp[i]로 선언.
 * /
 */