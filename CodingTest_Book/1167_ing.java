/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	
	static class node{
		int to;
		int cost;
		
		private node(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
		
	}
	
	private static int t1,t2,t3;
	private static ArrayList<node>[] graph;
	private static boolean[] visited;
	private static int[] distance;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[t1+1];
		visited = new boolean[t1+1];
		distance = new int[t1+1];
		
		for(int i=1;i<=t1;i++){
			graph[i] = new ArrayList<node>();
		}
		
		for(int i=1;i<=t1;i++){
			st = new StringTokenizer(br.readLine());
			int vertex = Integer.parseInt(st.nextToken());
			while(true){
				int input_to = Integer.parseInt(st.nextToken());
				if(input_to == -1){
					break;
				}
				int input_cost = Integer.parseInt(st.nextToken());
				graph[input_to].add(new node(input_to,input_cost));
			}
		}
		
		
	}
}
