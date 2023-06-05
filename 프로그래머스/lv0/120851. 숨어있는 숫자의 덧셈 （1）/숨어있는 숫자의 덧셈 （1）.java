class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //1.소문자를 대문자로 변경하고 replaceAll 사용
        //my_string.toUpperCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
        //2.정규표현식 사용
        String s = my_string.replaceAll("[^0-9]", "");
        String[] list = s.split("");
        for(int i=0; i<list.length; i++){
            answer += Integer.parseInt(list[i]);
        }
        
        return answer;
    }
}