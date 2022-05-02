#include<vector>
#include<queue>
#define x first
#define y second
using namespace std;

int n, m;
int result = 0;
int dist[101][101];
const int dx[4] = { 1, 0, -1, 0 };
const int dy[4] = { 0 , 1, 0, -1 };

void bfs(vector<vector<int>> maps)
{
    queue<pair<int, int>> q;

    q.push({ 0, 0 });
    dist[0][0] = 0;

    while (!q.empty())
    {
        auto cur = q.front();
        q.pop();

        for (int dir = 0; dir < 4; dir++)
        {
            int nx = cur.x + dx[dir];
            int ny = cur.y + dy[dir];

            if (nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1)
            {
                continue;
            }
            if (dist[nx][ny] != -1 || maps[nx][ny] == 0)
            {
                continue;
            }

            q.push({ nx, ny });
            dist[nx][ny] = dist[cur.x][cur.y] + 1;
        }
    }

}

int solution(vector<vector<int>> maps)
{
    int answer = 0;

    for (int i = 0; i < 101; i++)
    {
        for (int j = 0; j < 101; j++)
        {
            dist[i][j] = -1;
        }
    }

    n = maps.size();
    m = maps[0].size();

    bfs(maps);

    if (dist[n - 1][m - 1] != -1)
    {
        answer = dist[n - 1][m - 1] + 1;
    }
    else
    {
        answer = dist[n - 1][m - 1];
    }

    return answer;
}