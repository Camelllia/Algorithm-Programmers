import java.util.LinkedList;
import java.util.Queue;

class Solution {

    final int[] dx = {1,0,-1,0};
    final int[] dy = {0,1,0,-1};

    int[][] keyPad = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {-1,0,-1}
    };

    public String solution(int[] numbers, String hand) {

        String answer = "";
        String rightLoc = "32";
        String leftLoc = "30";
        String oneLoc = "00";
        String twoLoc = "01";
        String threeLoc = "02";
        String fourLoc = "10";
        String fiveLoc = "11";
        String sixLoc = "12";
        String sevenLoc = "20";
        String eightLoc = "21";
        String nineLoc = "22";
        String zeroLoc = "31";

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                switch (numbers[i]) {
                    case 3:
                        rightLoc = threeLoc;
                        break;
                    case 6:
                        rightLoc = sixLoc;
                        break;
                    case 9:
                        rightLoc = nineLoc;
                        break;
                }
                answer+= "R";
            } else if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                switch (numbers[i]) {
                    case 1:
                        leftLoc = oneLoc;
                        break;
                    case 4:
                        leftLoc = fourLoc;
                        break;
                    case 7:
                        leftLoc = sevenLoc;
                        break;
                }
                answer+= "L";
            } else {
                String targetLoc = "";
                int rx = Character.getNumericValue(rightLoc.charAt(0));
                int ry = Character.getNumericValue(rightLoc.charAt(1));
                int lx = Character.getNumericValue(leftLoc.charAt(0));
                int ly = Character.getNumericValue(leftLoc.charAt(1));
                if(numbers[i] == 2) {
                    targetLoc = twoLoc;
                    int tx = Character.getNumericValue(targetLoc.charAt(0));
                    int ty = Character.getNumericValue(targetLoc.charAt(1));
                    int leftDist = BFS(tx,ty,lx,ly);
                    int rightDist = BFS(tx,ty,rx,ry);
                    if(leftDist < rightDist) {
                        answer += "L";
                        leftLoc = targetLoc;
                    } else if(leftDist > rightDist) {
                        answer += "R";
                        rightLoc = targetLoc;
                    } else {
                        if(hand.equals("right")) {
                            answer += "R";
                            rightLoc = targetLoc;
                        } else {
                            answer += "L";
                            leftLoc = targetLoc;
                        }
                    }
                } else if(numbers[i] == 5) {
                    targetLoc = fiveLoc;
                    int tx = Character.getNumericValue(targetLoc.charAt(0));
                    int ty = Character.getNumericValue(targetLoc.charAt(1));
                    int leftDist = BFS(tx,ty,lx,ly);
                    int rightDist = BFS(tx,ty,rx,ry);
                    if(leftDist < rightDist) {
                        answer += "L";
                        leftLoc = targetLoc;
                    } else if(leftDist > rightDist) {
                        answer += "R";
                        rightLoc = targetLoc;
                    } else {
                        if(hand.equals("right")) {
                            answer += "R";
                            rightLoc = targetLoc;
                        } else {
                            answer += "L";
                            leftLoc = targetLoc;
                        }
                    }
                } else if(numbers[i] == 8) {
                    targetLoc = eightLoc;
                    int tx = Character.getNumericValue(targetLoc.charAt(0));
                    int ty = Character.getNumericValue(targetLoc.charAt(1));
                    int leftDist = BFS(tx,ty,lx,ly);
                    int rightDist = BFS(tx,ty,rx,ry);
                    if(leftDist < rightDist) {
                        answer += "L";
                        leftLoc = targetLoc;
                    } else if(leftDist > rightDist) {
                        answer += "R";
                        rightLoc = targetLoc;
                    } else {
                        if(hand.equals("right")) {
                            answer += "R";
                            rightLoc = targetLoc;
                        } else {
                            answer += "L";
                            leftLoc = targetLoc;
                        }
                    }
                } else if(numbers[i] == 0) {
                    targetLoc = zeroLoc;
                    int tx = Character.getNumericValue(targetLoc.charAt(0));
                    int ty = Character.getNumericValue(targetLoc.charAt(1));
                    int leftDist = BFS(tx,ty,lx,ly);
                    int rightDist = BFS(tx,ty,rx,ry);
                    if(leftDist < rightDist) {
                        answer += "L";
                        leftLoc = targetLoc;
                    } else if(leftDist > rightDist) {
                        answer += "R";
                        rightLoc = targetLoc;
                    } else {
                        if(hand.equals("right")) {
                            answer += "R";
                            rightLoc = targetLoc;
                        } else {
                            answer += "L";
                            leftLoc = targetLoc;
                        }
                    }
                }
            }
        }
        return answer;
    }

    int BFS(int targetX, int targetY, int startX, int startY) {
        if(targetX == startX && targetY == startY) {
            return 0;
        }
        int[][] dist = new int[4][3];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                dist[i][j] = -1;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {startX, startY});
        dist[startX][startY] = 0;

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int dir = 0; dir < 4; dir++) {
                int nx = curX + dx[dir];
                int ny = curY + dy[dir];

                if(nx < 0 || nx >= 4 || ny < 0 || ny >= 3) {
                    continue;
                }
                if(dist[nx][ny] != -1 || keyPad[nx][ny] == -1) {
                    continue;
                }

                q.add(new int[] {nx, ny});
                dist[nx][ny] = dist[curX][curY] + 1;
                if(nx == targetX && ny == targetY) {
                    return dist[targetX][targetY];
                }
            }
        }
        return 0;
    }
}