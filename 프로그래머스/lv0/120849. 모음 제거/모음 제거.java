class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] list = {"a", "e", "i", "o", "u"};
          
        for(String s : list){ 
            answer = answer.replaceAll(s, "");
            }
        return answer;
    }
}