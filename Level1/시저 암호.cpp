#include <string>
#include <vector>
#include <iostream>

using namespace std;

//char upper[26] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//char lower[26] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

string solution(string s, int n) {

    string answer = "";

    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == ' ')
        {
            answer += ' ';
            continue;
        }
        else
        {
            if (isupper(s[i]))
            {
                if (s[i] + n > 90)
                {
                    answer += char(((s[i] + n) - 90) + 64);
                }
                else
                {
                    answer += char(s[i] + n);
                }
            }
            if (islower(s[i]))
            {
                if (s[i] + n > 122)
                {
                    answer += char(((s[i] + n) - 122) + 96);
                }
                else
                {
                    answer += char(s[i] + n);
                }
            }
        }
    }

    return answer;
}