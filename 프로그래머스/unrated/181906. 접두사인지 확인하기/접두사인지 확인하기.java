class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        //startsWith:대상 문자열이 특정 문자 또는 문자열로 시작하는지
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }
}