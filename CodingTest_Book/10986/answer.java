import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
     
    int t1 = Integer.parseInt(st.nextToken());
	int t2 = Integer.parseInt(st.nextToken());
	 long[] nnum = new long[t1+1];
	 long[] snum = new long[t2];
	 long answer = 0;
	 
	 st = new StringTokenizer(br.readLine());
	 
	 // i번째까지 배열의 구간 합+
	 // 구간 합 배열 모든 값에 %연산 수행 + 수행한 결과를 snum에 저장
	 for(int i = 1;i < t1+1;i++){
	 	nnum[i] = (nnum[i-1] + Integer.parseInt(st.nextToken())) % t2;
	 	//System.out.println(i+": "+nnum[i] +" : " +nnum[i-1]);
	 	if(nnum[i] == 0){
	 		answer++;
	 	}
	 	snum[(int)nnum[i]]++;
	 	
	 }
	 
	 //나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
	 for(int i = 0;i<t2;i++){
		if(snum[i] >1){
			answer +=  (snum[i] * (snum[i]-1) / 2) ;
		}
	 } 
	 System.out.println(answer);        

 }
}
