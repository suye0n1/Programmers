import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 1;
        //오름차순 정렬
        Arrays.sort(numbers);
        //for문 큰 수 두 개 꺼내서 곱하기
        for(int i=numbers.length-1; i>=numbers.length-2; i--){
            answer *= numbers[i];
        }
        return answer;
    }
}