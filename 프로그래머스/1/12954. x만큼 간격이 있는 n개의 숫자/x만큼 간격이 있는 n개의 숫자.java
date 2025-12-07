class Solution {
    public long[] solution(int x, int n) {
      // 1. n개의 숫자를 담을 배열을 미리 생성합니다.
        // 배열의 크기가 정해져 있으므로 ArrayList 대신 배열을 쓰는 것이 효율적입니다.
        long[] answer = new long[n];
        
        // 2. 반복문을 돌며 값을 채웁니다.
        // x의 값을 계속 더해가는 방식 혹은 곱하는 방식을 사용합니다.
        for (int i = 0; i < n; i++) {
            // 주의: x * (i+1)을 할 때 x가 큰 수이면 int 범위를 넘을 수 있습니다.
            // 따라서 (long)으로 형변환을 먼저 해줘야 안전합니다.
            answer[i] = (long) x * (i + 1);
        }
        
        return answer;
    }
}