import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        List<Integer> list = new ArrayList<>();
        for(int i=start; i<=end; i++){
            list.add(i);
        }
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //향상된 for문
        //int i = 0;
        //for (int num : list) {
       // answer[i] = num;
         //   i++;
       // }
        return answer;
    }
}