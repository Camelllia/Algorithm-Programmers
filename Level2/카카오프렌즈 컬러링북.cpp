#include <vector>
#include <queue>
#include <cstring>
#include <algorithm>
#define x first
#define y second
using namespace std;

const int dx[4] = { 1, 0, -1 ,0 };
const int dy[4] = { 0, 1, 0, -1 };
bool visited[101][101];

int bfs(int i, int j, int m, int n, vector<vector<int>> board)
{
    int color = board[i][j];
    queue<pair<int, int>> q;
    q.push({ i, j });
    visited[i][j] = true;
    int size = 0;

    while (!q.empty())
    {
        auto cur = q.front();
        size++;
        q.pop();

        for (int dir = 0; dir < 4; dir++)
        {
            int nx = cur.x + dx[dir];
            int ny = cur.y + dy[dir];

            if (nx < 0 || nx >= m || ny < 0 || ny >= n)
            {
                continue;
            }
            if (visited[nx][ny] || board[nx][ny] != color)
            {
                continue;
            }

            q.push({ nx, ny });
            visited[nx][ny] = true;
        }
    }

    return size;
}

vector<int> solution(int m, int n, vector<vector<int>> picture) {

    int number_of_area = 0;
    int max_size_of_one_area = 0;

    memset(visited, false, sizeof(visited));

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (!visited[i][j] && picture[i][j] != 0)
            {
                max_size_of_one_area = max(max_size_of_one_area, bfs(i, j, m, n, picture));
                number_of_area++;
            }
        }
    }

    vector<int> answer(2);
    answer[0] = number_of_area;
    answer[1] = max_size_of_one_area;
    return answer;
}