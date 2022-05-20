#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> d, int budget) {

    int answer = 0;
    int cost = 0;

    sort(d.begin(), d.end());

    for (int i = 0; i < d.size(); i++)
    {
        cost += d[i];
        answer++;
        if (cost == budget)
        {
            break;
        }
        else if (cost > budget)
        {
            cost -= d[i];
            answer--;
        }
    }


    return answer;
}