import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                st.add(s.charAt(i));
            } else {
                if(st.size() == 0) {
                    return false;
                }
                st.pop();
            }
        }

        answer = st.size() == 0 ? true : false;

        return answer;
    }
}