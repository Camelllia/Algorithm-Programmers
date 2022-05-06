class Solution {
    public int[] solution(int[] answers) {

        final int[] one = {1, 2, 3, 4, 5};
        final int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int temp = 0;

        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;

        int answerIdx = 0;
        int oneIdx = 0;
        int twoIdx = 0;
        int threeIdx = 0;

        while (true) {
            if(one[oneIdx] == answers[answerIdx]) {
                oneScore++;
            }
            if(two[twoIdx] == answers[answerIdx]) {
                twoScore++;
            }
            if(three[threeIdx] == answers[answerIdx]) {
                threeScore++;
            }

            oneIdx++;
            twoIdx++;
            threeIdx++;
            answerIdx++;

            if(oneIdx == 5) {
                oneIdx = 0;
            }
            if(twoIdx == 8) {
                twoIdx = 0;
            }
            if(threeIdx == 10) {
                threeIdx = 0;
            }

            if(answerIdx == answers.length) {
                break;
            }
        }

        temp = Math.max(oneScore, twoScore);
        temp = Math.max(temp, threeScore);

        String leaderBoard = "";

        if(temp == oneScore) {
            leaderBoard += "1";
        }
        if(temp == twoScore) {
            leaderBoard += "2";
        }
        if(temp == threeScore) {
            leaderBoard += "3";
        }

        int[] answer = new int[leaderBoard.length()];

        for(int i = 0; i < leaderBoard.length(); i++) {
            answer[i] = Character.getNumericValue(leaderBoard.charAt(i));
        }

        return answer;
    }
}