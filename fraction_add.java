class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        int mod = 0;
        
        answer[0] = (numer1 * denom2)+(numer2 * denom1);  //분자
        answer[1] = (denom1 * denom2); //분모
                   
        //System.out.println(answer[0]);
        //System.out.println(answer[1]);
        //System.out.println(10%8);
       // System.out.println(8%8);
        
        mod = gcd(answer[0],answer[1]);
        
        answer[0] /= mod;
        answer[1] /= mod;            
        
        return answer;
    }
    
    //유클리드 호제법
    //기약분수를 구하기 위해서 사용
    public static int gcd(int a , int b){
        if(a % b == 0){                    
            return b;
        }
        
     return gcd(b,a%b);
    }
}
