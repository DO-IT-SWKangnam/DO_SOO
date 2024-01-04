
public class dbfs {
	public static void main(String[] args) {
	    int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	    int out = new Solution1_1().solution(graph);
	    System.out.println(out);
	}
}

class Solution1_1 {
    void dfs(int[][]graph, boolean[] vistied, int nodeIndex) {
        // 방문 처리
        vistied[nodeIndex] = true;
        // 방문 노드 출력
        System.out.print(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[nodeIndex]) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                dfs(graph, vistied, node);
            }
        }
    }
    
    public int  solution(int[][]graph) {
        boolean[] vistied = new boolean[9];
        dfs(graph, vistied, 1);
        return 0;
    }

}

class Solution1_2 {

    int[][]graph;
    boolean[] vistied;
    
    void dfs(int nodeIndex) {
        // 방문 처리
        vistied[nodeIndex] = true;
        // 방문 노드 출력
        System.out.print(nodeIndex + " -> ");
    
        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[nodeIndex]) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                dfs(node);
            }
        }
    }
    
    public int  solution(int[][]graph) {
        vistied = new boolean[9];
        dfs(1);
        return 0;
    }
}