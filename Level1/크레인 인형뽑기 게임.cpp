#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <stack>

using namespace std;

int bombCnt = 0;
stack<int> basket;
vector<vector<int>> map;

void pick(int line)
{
    for (int i = 0; i < map.size(); i++)
    {
        if (map[i][line] != 0)
        {
            if (!basket.empty())
            {
                if (basket.top() == map[i][line])
                {
                    bombCnt++;
                    basket.pop();
                    map[i][line] = 0;
                    break;
                }
            }
            basket.push(map[i][line]);
            map[i][line] = 0;
            break;
        }
    }
}

int solution(vector<vector<int>> board, vector<int> moves) {

    int answer = 0;

    // copy
    map.assign(board.size(), vector<int>(board.size()));
    copy(board.begin(), board.end(), map.begin());

    // pick
    for (int i = 0; i < moves.size(); i++)
    {
        pick(moves[i] - 1);
    }

    answer = bombCnt * 2;

    return answer;
}