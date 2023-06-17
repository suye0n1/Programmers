class Solution {
    public int solution(int n) {
        int answer = 2;
        //for(int i=1; i<=n; i++){
        //    if(i*i == n){
        //        answer = 1;
        //    } 
        //}
        //Math.sqrt() 함수사용해서 구하기
        double d = Math.sqrt(n);
        if((int)d*d == n){
            answer = 1;
        }
        return answer;
    }
}