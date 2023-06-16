import java.util.*;

class Solution {
        public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        int index = 0;
        Arrays.sort(num_list); //오름차순 정렬
        for(int i=num_list.length-1; i>4; i--){
            answer[index] = num_list[i];
            index++;
        }
            Arrays.sort(answer);
        return answer;
    }
}