import java.util.Locale;

class Solution {
    public String solution(String new_id) {

        String answer = "";

        // step1
        new_id = new_id.toLowerCase();

        // step2
        for(int i = 0; i < new_id.length(); i++) {

            char c = new_id.charAt(i);
            if(c == '.' || c == '-' || c == '_' || Character.isDigit(c) == true || Character.isLowerCase(c)) {
                continue;
            } else {
                System.out.println(c);
                new_id = new_id.substring(0,i) + new_id.substring(i+1);
                i--;
            }
        }

        // step3
        for(int i = 0; i < new_id.length() - 1; i++) {
            if(new_id.charAt(i) == '.' && new_id.charAt(i + 1) == '.') {
                if(new_id.length() > 0) {
                    new_id = new_id.substring(0,i + 1) + new_id.substring(i+2);
                    i--;
                }
            }
        }

        // step4
        if(new_id.length() > 0) {
            if(new_id.charAt(0) == '.') {
                new_id = new_id.substring(1);
            }
        }
        if(new_id.length() > 0) {
            if(new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // step5
        if(new_id.length() == 0) {
            new_id = "a";
        }

        // step6
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // step7
        if(new_id.length() <= 2) {
            while (true) {
                char c = new_id.charAt(new_id.length() - 1);
                new_id += c;
                if (new_id.length() == 3) {
                    break;
                }
            }
        }

        System.out.println(new_id);

        answer = new_id;

        return answer;
    }
}