import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //오름차순 정렬
       Arrays.sort(numbers);
        //양끝 비교
        int number1 = numbers[0]*numbers[1];
        int number2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        if(number1 > number2){
            answer = number1;
        } else{
            answer = number2;
        }
    
        return answer;
    }
}