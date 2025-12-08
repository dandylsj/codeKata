class Solution {
    public long[] solution(int x, int n) {
      // 1. n개의 숫자를 담을 배열을 미리 생성
        long[] answer = new long[n];
        
        // 2. 반복문을 돌며 값을 채움
        for (int i = 0; i < n; i++) {
           
            answer[i] = (long) x * (i + 1);
        }
        
        return answer;
    }
}