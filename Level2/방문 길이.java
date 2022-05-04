class Solution {

    // 앞에 2개 -> 지금 도착한 위치, 뒤에 2개 -> 출발지의 위치
    int[][][][] board = new int[11][11][11][11];
    int moveCnt = 0;
    int x = 5;
    int y = 5;

    public int solution(String dirs) {

        int answer = 0;

        for(int i = 0; i < dirs.length(); i++) {
            move(dirs.charAt(i));
            System.out.println("i = " + i +  " moveCnt = " + moveCnt);
        }

        answer = moveCnt;

        return answer;
    }

    public void move(char dir) {
        switch (dir) {
            case 'U':
                x--;
                if(x < 0) {
                    x++;
                    break;
                } else {
                    if(board[x][y][x + 1][y] == 0) {
                        board[x][y][x + 1][y] = 1;
                        board[x + 1][y][x][y] = 1;
                        moveCnt++;
                    }
                    break;
                }
            case 'D':
                x++;
                if(x > 10) {
                    x--;
                    break;
                } else {
                    if(board[x][y][x - 1][y] == 0) {
                        board[x][y][x - 1][y] = 1;
                        board[x - 1][y][x][y] = 1;
                        moveCnt++;
                    }
                    break;
                }
            case 'R':
                y++;
                if(y > 10) {
                    y--;
                    break;
                } else {
                    if(board[x][y][x][y - 1] == 0) {
                        board[x][y][x][y - 1] = 1;
                        board[x][y - 1][x][y] = 1;
                        moveCnt++;
                    }
                    break;
                }
            case 'L':
                y--;
                if(y < 0) {
                    y++;
                    break;
                } else {
                    if(board[x][y][x][y + 1] == 0) {
                        board[x][y][x][y + 1] = 1;
                        board[x][y + 1][x][y] = 1;
                        moveCnt++;
                    }
                    break;
                }
        }
    }
}