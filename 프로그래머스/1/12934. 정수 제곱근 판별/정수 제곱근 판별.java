class Solution {
    public long solution(long n) {
        long answer = 0;
        //제곱근 구하기(Math.sqrt : 제곱근 구하는 함수)
        double sqrt = Math.sqrt(n);

        //if조건문 : 제곱근인지 판단
        if(sqrt % 1 == 0){
	        answer = (long)Math.pow(sqrt+1, 2); //Math.pow() : 제곱
        }   
        else answer = -1;
        
        return answer;
    }
}