class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
 	String sub_str = my_string.substring(s, e+1);
	String reverse_str = "";
	for(int i = sub_str.length()-1; i >= 0; i--){
		reverse_str +=  String.valueOf(sub_str.charAt(i));
	}       
	String left = my_string.substring(0, s);
	String center = reverse_str;
	String right = my_string.substring(e+1);
	answer = left + center + right;
        return answer;


    }
}