import java.util.*;
import java.io.*;

public class virusGraph {
	static int N, M, max;
    static int[][] lab, temp;
    static ArrayList<Point> virusList = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    static class Point {
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        lab = new int[N][M];
        temp = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                lab[i][j] = Integer.parseInt(st.nextToken());
                if(lab[i][j] == 2)
                    virusList.add(new Point(i, j));
            }
        }

        dfs(0, 0, 0);
        System.out.println(max);
    }

    static void dfs(int x, int y, int count){
        if(count == 3){
            copyLab();
            for(Point p : virusList){
                spreadVirus(p.x, p.y);
            }
            max = Math.max(max, getSafeArea());
            return;
        }

        if(y >= M){
            dfs(x + 1, 0, count);
            return;
        }

        if(x >= N){
            return;
        }

        if(lab[x][y] == 0){
            lab[x][y] = 1;
            dfs(x, y + 1, count + 1);
            lab[x][y] = 0;
        }
        dfs(x, y + 1, count);
    }

    static void spreadVirus(int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<M){
                if(temp[nx][ny] == 0 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    temp[nx][ny] = 2;
                    spreadVirus(nx, ny);
                }
            }
        }
    }

    static void copyLab(){
        for(int i=0; i<N; i++){
            temp[i] = Arrays.copyOf(lab[i], M);
        }
        visited = new boolean[N][M];
    }

    static int getSafeArea(){
        int safe = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(temp[i][j] == 0) safe++;
            }
        }
        return safe;
    }
}
