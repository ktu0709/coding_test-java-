/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t1 = Integer.parseInt(st.nextToken());
		int[] t2 = new int[t1];
		Queue<Integer> que = new LinkedList<>();
		int cnt = 0;
		int check_num = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			t2[i] = Integer.parseInt(st.nextToken());
		}
		
		while(cnt < t1){
			check_num = t2[cnt];
			//System.out.println("cnt : "+cnt +"," +check_num);
			if(que.isEmpty()){  //큐가 비어있음 
				que.add(check_num);
			}
			
			for(int j=cnt+1;j<=t1;j++){ //오큰수 찾기 for문 
				//System.out.println("j: "+j);
				if(j==t1){
					bw.write(-1+" ");
					break;
				}
				if(que.peek() < t2[j]){
					bw.write(t2[j]+" ");
					que.add(t2[j]);
					que.remove();
					break;
				}

			}		
			
			cnt++;
			que.clear();
		}
		bw.flush();
		bw.close();
					
	}
}
