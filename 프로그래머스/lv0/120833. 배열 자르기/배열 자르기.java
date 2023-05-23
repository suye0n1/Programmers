class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        //for문 사용해서 num1부터 num1까지 answer배열에 담기
        for(int i=num1; i<=num2; i++){
            answer[i-num1] = numbers[i];
        }
        return answer;
    }
}