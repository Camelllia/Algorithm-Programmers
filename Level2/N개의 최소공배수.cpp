#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<int> arr) {

    int answer = 0;
    int result = 0;
    bool init = true;

    for (int i = 0; i < arr.size(); i++)
    {
        int a, b, temp;
        if (init)
        {
            if (arr[i] > arr[i + 1])
            {
                a = arr[i];
                b = arr[i + 1];
            }
            else
            {
                a = arr[i + 1];
                b = arr[i];
            }

            while (true)
            {
                temp = a % b;
                a = b;
                b = temp;

                if (temp == 0)
                {
                    result = (arr[i] * arr[i + 1]) / a;
                    break;
                }
            }

            i = 1;
            init = false;
        }
        else
        {
            if (result > arr[i])
            {
                a = result;
                b = arr[i];
            }
            else
            {
                a = arr[i];
                b = result;
            }

            while (true)
            {
                temp = a % b;
                a = b;
                b = temp;

                if (temp == 0)
                {
                    result = (result * arr[i]) / a;
                    break;
                }
            }
        }
    }

    return result;
}