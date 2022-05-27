class Solution {

    boolean[] visited = new boolean[201];

    public int solution(int n, int[][] computers) {

        int answer = 0;

        for(int i = 0; i < computers.length; i++) {
            if(!visited[i]) {
                answer++;
                DFS(i, computers, computers.length);
            }
        }

        return answer;
    }

    void DFS(int n, int[][] computers, int size) {

        visited[n] = true;

        for(int i = 0; i < size; i++) {
            if(!visited[i] && computers[n][i] == 1) {
                DFS(i, computers, size);
            }
        }
    }
}