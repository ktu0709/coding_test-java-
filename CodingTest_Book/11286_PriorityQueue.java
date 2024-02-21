/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{	
	
	public static int compare_func(int a , int b){
		if(Math.abs(a) == Math.abs(b)){
			return  a > b ? 1:-1;
		}
		else
			return Math.abs(a) - Math.abs(b);

		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 절댓값을 비교하는 우선순위 큐
		//Queue<Integer> que = new PriorityQueue<>((a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
		//Queue<Integer> que = new PriorityQueue<>((a, b) -> Integer.compare(a,b));
		Queue<Integer> que = new PriorityQueue<>((a, b) -> compare_func(a,b));
		
		int t1 = Integer.parseInt(st.nextToken());
		for(int i=0;i<t1;i++){
			st = new StringTokenizer(br.readLine());
			int chk = Integer.parseInt(st.nextToken());
			//System.out.println(que);
			if(chk == 0){  //만약 0일 경우, 출력 + 절댓값이 작은 값 제거
				if(que.isEmpty()) bw.write(0+"\n");
				else bw.write(que.poll()+"\n");
				
			}
			else{ //아닐 경우 삽입
				que.offer(chk);
			}
			
		}
					
			bw.flush();
			bw.close();


	}
}
