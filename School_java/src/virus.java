import java.util.*;
import java.io.*;

public class virus {
	static int N, M, max;
    static int[][] lab, temp;
    static ArrayList<Point> virusList = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

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
        
        // 단계 1: 모든 빈칸의 위치를 찾습니다.
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                lab[i][j] = Integer.parseInt(st.nextToken());
                if(lab[i][j] == 2)
                    virusList.add(new Point(i, j));
            }
        }

        // 단계 2, 3, 4, 5: 모든 조합을 생성, 바이러스 확산 시뮬레이션, 안전 영역 계산
        setWall(0, 0);
        // 0,0부터 시작해 벽을 세울수 있는 모든 위치를 탐색. 
        System.out.println(max);
    }

    // 단계 2: 모든 조합을 생성
    static void setWall(int start, int depth){
        //depth = 벽의 갯, 벽을 3개 세웠다면 연구실을 복사하고 바이러스를 확산 시뮬 진행.
    	if(depth == 3){
            copyLab();
            
            // 단계 3: 바이러스 확산 시뮬레이션
            for(Point p : virusList)
                spreadVirus(p.x, p.y);
            
            // 단계 4: 안전 영역 계산
            max = Math.max(max, getSafeArea());
            return;
        }
    	
    	// start에서 연구실 모든 위치를 순회, 이 때 i를 M으로 나눈 몫과 나머지를 이용해, 2차원 위치를 계산. 
        for(int i=start; i<N*M; i++){
            int x = i/M;
            int y = i%M;

            if(lab[x][y] == 0){
                lab[x][y] = 1;
                // 벽을 세울때마다 setwall 함수를 호출해, 벽을 하나 더 세움.
                setWall(i+1, depth+1);
                lab[x][y] = 0;
                // 재귀 호출이 끝나고 나면, 벽을 제거해, 빈 칸 상태를 복원. 
            }
        }
    }

    // 바이러스 확산을 위한 보조 함수
    static void spreadVirus(int x, int y){
    	//x,y에서 상하좌우 네 방향을 순회, 이를 위해 for 문을 이용해, dx,dy 배열을 이용해 각 방향을 계산.
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // nx,ny가 연구실 내부에 있는지? 그 위치가 빈칸인지 확인. 
            if(nx>=0 && ny>=0 && nx<N && ny<M){
                if(temp[nx][ny] == 0){
                    temp[nx][ny] = 2;
                    // 빈칸이라면 해당 위치를 2로 확산. 
                    spreadVirus(nx, ny);
                    // 확산 된 위치에서도 동일하게 spreadVirus함수 재 실행. 
                }
            }
        }
    }

    // 연구실 복사를 위한 보조 함수
    static void copyLab(){
        for(int i=0; i<N; i++)
        	// 연구실의 현재상태를 복사해 temp 배열에 저장. 원본 배열 훼손 x 
            temp[i] = Arrays.copyOf(lab[i], M);
    }

    // 안전 영역 계산을 위한 보조 함수
    static int getSafeArea(){
        int safe = 0;
        // temp 배열에서 빈 칸(0)의 개수를 세어 안전 영역의 크기를 계산. 
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(temp[i][j] == 0) safe++;
            }
        }
        return safe;
    }
}