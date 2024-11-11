class Solution {
    public int solution(int n) {
        int answer = 0;
        for ( int a = 2; a <= n; a += 2) {
            answer += a;
        }
        return answer;
    }
}