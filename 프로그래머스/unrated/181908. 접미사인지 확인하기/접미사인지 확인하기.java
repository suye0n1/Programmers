
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String s = "";
        if(my_string.length()<is_suffix.length()){
            answer = 0;
        } else{
            s = my_string.substring(my_string.length()-is_suffix.length());
            if(s.equals(is_suffix)){
            answer = 1;
        } 
        }
        
        return answer;
    }
}