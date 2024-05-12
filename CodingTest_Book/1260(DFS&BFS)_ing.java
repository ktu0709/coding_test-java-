import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int t1,t2,t3;
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	private static void dfs(int n){
		if(visited[n]){
			return;
		}
		
		visited[n]=true;
		System.out.print(n + " ");
		for(int i : graph[n]){
			if(!visited[i]){
				dfs(i);
			}
		}
		
	} 
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    t1 = Integer.parseInt(st.nextToken());
	    t2 = Integer.parseInt(st.nextToken());
	    t3 = Integer.parseInt(st.nextToken());
		
		
		graph = new ArrayList[t1+1];
		visited = new boolean[t1+1];
		
		for(int i=1;i<=t1;i++){
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<t2;i++){
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
	    	int v = Integer.parseInt(st.nextToken());
	    	
	    	//쌍방향
	    	graph[u].add(v);
	    	graph[v].add(u);
		}
		
		for(int i=1;i<=t1;i++){
			dfs(i);
		}
		
		
		
	}
}
