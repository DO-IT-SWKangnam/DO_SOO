
public class carpet {
	public static void main(String args[]) {
		int p1 =3;
		int p2 =4;
		
		int[] output = new carpetSolution().solution(p1, p2);
		
		System.out.println(output);
	}

}

class carpetSolution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for (int i = 3; i <= total; i++) {
            if (total % i == 0) {
                int x = total / i;
                int y = i;
                
                if (4 + (x - 2) * 2 + (y - 2) * 2 == brown) {
                    return new int[] {x, y};
                }
            }
        }
        
        return null;
    }
}

