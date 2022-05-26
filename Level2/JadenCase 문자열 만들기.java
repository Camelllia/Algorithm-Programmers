class Solution {
    public String solution(String s) {

        String answer = "";
        boolean flag = false;

        if(s.charAt(s.length() - 1) == ' ') {
            flag = true;
        }

        String[] str =  s.split(" ");

        for(int i = 0; i < str.length; i++) {

            StringBuilder sb = new StringBuilder(str[i]);

            for(int j = 0; j < sb.length(); j++) {
                if(j == 0) {
                    if(Character.isDigit(sb.charAt(0))) {
                        sb.setCharAt(1, Character.toUpperCase(sb.charAt(1)));
                    } else {
                        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                    }
                } else {
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
            }

            if(i == str.length - 1 && flag == false) {
                answer += sb;
            } else {
                answer += sb + " ";
            }
        }

        return answer;
    }
}