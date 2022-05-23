class Solution {
    public String solution(String s) {

        String answer = "";
        String temp = "";

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == ' ') {
                for(int j = 0; j < temp.length(); j++) {
                    if(j % 2 == 0) {
                        answer += Character.toUpperCase(temp.charAt(j));
                    } else {
                        answer += Character.toLowerCase(temp.charAt(j));
                    }
                }
                answer += ' ';
                temp = "";
            } else {
                temp += s.charAt(i);
                if(i == s.length() - 1) {
                    for(int j = 0; j < temp.length(); j++) {
                        if(j % 2 == 0) {
                            answer += Character.toUpperCase(temp.charAt(j));
                        } else {
                            answer += Character.toLowerCase(temp.charAt(j));
                        }
                    }
                }
            }
        }

        return answer;
    }
}