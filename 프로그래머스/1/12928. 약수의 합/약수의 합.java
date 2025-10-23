class Solution {
    public int solution(int n) {
        int sum = 0; //약수의 합
        for(int i = 1;i <= n; i++){ //i는 정수 ,i의 값과 n 이 같을때 까지 더하기
            if(n % i == 0){ // n/i  일때 나머지가 0이면
                sum += i; //i를 더하기
            }else {  //아니면 ㅂㅂ
                
            }
        }
        return sum;
    }
}