import java.util.HashMap;

public class factorial {
	public static void main(String args[]) {
		 //1,1,2,3,5,8,13,21,34,55
        //System.out.println(fibo(47));
        //System.out.println(fibo2(47));
        System.out.println(fibo3(47));
        System.out.println(fibo4(47));

	}

public static long factorial(int n) {
    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}

public static int factorial2(int n) {
    if (n <= 1)         return n;
    else return factorial2(n-1) * n;
}

public static long fibo(int n) {
	if(n<=2)
		return 1;
	else 
		return fibo(n-2) + fibo(n-1);
}

public static long fibo2(int n) {
	if(n<=2)
		return 1 ;
	long[] ans = new long[n];
	ans[0] = 1;
	ans[1] = 1;
	
	for(int i =2; i<n; i++) {
		ans[i] = ans[i-2] + ans[i-1]; // 이전 값을 그냥 가져다 쓰기만 함. 
	}
	
	return ans[n-1];
}

public static long fibo3(int n) {
	if(n<=2) 
		return 1;
	
	long num1 = 1;
	long num2 = 2;
	long num3 = 0;
	
	for(int i =2; i<n; i++) {
		num3 = num1 + num2;
		num1 = num2; // 이 방식을 통해 
		num2 = num3; // 배열을 굳이 쓸 필요 없음.
	}
	return num3;
}

public static HashMap<Integer, Long> cache = new HashMap<>();
public static long fibo4(int n) {
	if(n<=2) 
		cache.put(n, 1L);
	long v = cache.getOrDefault(n, (long) -1);
	if(v != -1)
		return v;
	else {
		v = fibo4(n-2) + fibo4(n-1);
		cache.put(n, v);
		return v;
	}
		// 값을 hashmap에다가 미리 저장해놓고 푸는 것. 
}
public static long fiboMy(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

}

