/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static int bubble_sort(int a, int b){
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t1 = Integer.parseInt(st.nextToken());
		int[] arr = new int[t1+1];
		Queue<Integer> que = new PriorityQueue<>();
		
		for(int i=1;i<=t1;i++){
		st = new StringTokenizer(br.readLine());
		que.add(Integer.parseInt(st.nextToken()));
		}
	
        bw.write(+ "\n");
		
		bw.flush();
		bw.close();
	}
}
