import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String s = my_string.replaceAll("[a-z]", "");
        String[] list = s.split("");
        int[] answer = new int[list.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}