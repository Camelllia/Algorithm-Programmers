#include <string>
#include <cstring>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int m = 0;
int big = -1;
int small = 7;
int origin = 0;
int arr[46];
int all[46];
bool isused[46];
bool checkUsed[46];
bool correctUsed[46];

void func(int cnt, int idx)
{
    int correctCnt = 0;

    if (cnt == m)
    {
        for (int i = 0; i < m; i++)
        {
            if (!checkUsed[arr[i]] && correctUsed[arr[i]])
            {
                correctCnt++;
            }
        }
        big = max(big, correctCnt);
        small = min(small, correctCnt);
        return;
    }

    for (int i = idx; i < 45; i++)
    {
        isused[i] = true;
        arr[cnt] = all[i];
        func(cnt + 1, i + 1);
        isused[i] = false;
    }
}

vector<int> solution(vector<int> lottos, vector<int> win_nums) {

    vector<int> answer;

    memset(isused, false, sizeof(isused));

    for (int i = 0; i < lottos.size(); i++)
    {
        for (int j = 0; j < lottos.size(); j++)
        {
            if (lottos[i] == win_nums[j])
            {
                origin++;
            }
        }
    }

    if (origin == 6)
    {
        answer.push_back(1);
        answer.push_back(1);
        return answer;
    }

    for (int i = 0; i < win_nums.size(); i++)
    {
        correctUsed[win_nums[i]] = true;
    }

    for (int i = 0; i < lottos.size(); i++)
    {
        if (lottos[i] == 0)
        {
            m++;
        }
        else
        {
            isused[lottos[i]] = true;
            checkUsed[lottos[i]] = true;
        }
    }

    if (m == 6)
    {
        answer.push_back(1);
        answer.push_back(6);
        return answer;
    }

    for (int i = 0; i < 45; i++)
    {
        all[i] = i + 1;
    }

    func(0, 0);

    big += origin;
    small += origin;

    switch (big)
    {
    case 6:
        answer.push_back(1);
        break;
    case 5:
        answer.push_back(2);
        break;
    case 4:
        answer.push_back(3);
        break;
    case 3:
        answer.push_back(4);
        break;
    case 2:
        answer.push_back(5);
        break;
    default:
        answer.push_back(6);
        break;
    }

    switch (small)
    {
    case 6:
        answer.push_back(1);
        break;
    case 5:
        answer.push_back(2);
        break;
    case 4:
        answer.push_back(3);
        break;
    case 3:
        answer.push_back(4);
        break;
    case 2:
        answer.push_back(5);
        break;
    default:
        answer.push_back(6);
        break;
    }

    return answer;
}