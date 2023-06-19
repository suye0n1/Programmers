class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //a+b = 값 b+a = 값 비교해서 큰 값 리턴
        String s1 = String.valueOf(a)+String.valueOf(b);
        String s2 = String.valueOf(b)+String.valueOf(a);
        if(Integer.parseInt(s1) > Integer.parseInt(s2)){
            answer = Integer.parseInt(s1);
        } else{
            answer = Integer.parseInt(s2);
        }
        
        return answer;
    }
}