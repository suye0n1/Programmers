class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] list = control.split("");
        int w = 1;
        int s = -1;
        int d = 10;
        int a = -10;
        for(int i=0; i<list.length; i++){
            if(list[i].equals("w")){
                n += w;
            }   else if(list[i].equals("s")){
                  n += s;
            }   else if(list[i].equals("d")){
                n += d;
            }   else{
                n += a;
            }
        }
        answer = n;
        return answer;
    }
}