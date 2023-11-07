class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int mode = 0; //최빈값 저장
        int maxFreq = 0; //최빈값 빈도
        
        for(int a=0;a<array.length;a++){
            int currNum = array[a];
            int currFreq = 1; //현재 숫자빈도
            
            for (int b=a+1;b<array.length;b++){
                if(array[b] == currNum)
                currFreq++;
            }
            // 만약 현재 값의 빈도수가 더 크다면 최빈값 업데이트
            if (currFreq > maxFreq){
                maxFreq = currFreq;
                mode = currFreq;
            }            
            //만약 최빈값이 같다면 -1                
            else if(currFreq == maxFreq){
                mode = -1;
            }
                        
        }
        answer = mode;
        return answer;
    }
}
