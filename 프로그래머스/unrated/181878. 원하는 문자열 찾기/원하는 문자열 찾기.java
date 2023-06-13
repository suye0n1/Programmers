class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStringUpper = myString.toUpperCase();
        String patUpper = pat.toUpperCase();
        if(myStringUpper.contains(patUpper)){
            answer = 1;
        }
        System.out.println(myString);
        System.out.println(pat);
        return answer;
    }
}