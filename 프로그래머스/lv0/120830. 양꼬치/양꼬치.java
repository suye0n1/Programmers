class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sum = (n*12000)+(k*2000);
        int service = 0;
        service = (n/10)*2000;
        answer = sum-service;
        return answer;
    }
}