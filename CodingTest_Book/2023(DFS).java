import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int t1;
	
	private static boolean isPrime(int n){
		for(int i = 2;i<=(int)Math.sqrt(n);i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	
	private static void dfs(int num,int digit){
		if(digit == t1){
			if(isPrime(num)){
				System.out.println(num);
			}
			return;
		}
		
		for(int i = 1 ;i < 10 ;i++){
			//짝수일 경우 pass
			if(i % 2 == 0){
				continue;
			}
			//홀수일 경우
			//자릿수를 늘려 재귀 진행
			if(isPrime(num*10+i)){
        //System.out.println("num: " + num);
				//System.out.println("i: " + i);
				dfs(num*10+i,digit+1);
			}
			
		}
		
	}
	

	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		t1 = Integer.parseInt(st.nextToken());
		
		dfs(2,1);
		dfs(3,1);
		dfs(5,1);
		dfs(7,1);
		
	}
}
