class Solution {
    public String solution(String s) {

        String answer = "";

        if(s.length() % 2 == 0) {
            int idx = s.length() / 2;
            answer += s.charAt(idx - 1);
            answer += s.charAt(idx);
        } else {
            int idx = s.length() / 2;
            answer += s.charAt(idx);
        }
        return answer;
    }
}