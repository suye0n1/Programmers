class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim();
        String[] tmp = my_string.split("\\s+");
        return tmp;
    }
}