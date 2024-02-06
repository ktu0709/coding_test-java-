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
		int[] res = new int[t1];
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		int check_num = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			t2[i] = Integer.parseInt(st.nextToken());
		}
		
		stack.push(0);
		for(int i=1;i<t1;i++){
		  
		  while(!stack.isEmpty() && t2[stack.peek()] < t2[i]){ //새로운수보다 작을 경우
		  	res[stack.pop()] = t2[i];
		  }
		  stack.push(i);
		}
		
		while(!stack.isEmpty()){
			res[stack.pop()] = -1;
			}
			
			for(int j=0;j<t1;j++){
				bw.write(res[j]+" ");
			}
		
		bw.flush();
		bw.close();
		
		
		
	}
}
