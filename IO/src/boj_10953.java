import java.util.Scanner;

public class boj_10953 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i<T; i++) {
			String[] input = sc.nextLine().split(",");
			
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			System.out.println(A+B);
		}
	}
}
