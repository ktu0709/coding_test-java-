import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{	
	static int t1, t2;
	static int[][] graph;
	static boolean[] visit;
	
	private static void dfs(int x){
		if(visit[x]){
			return;	
		}
		
		visit[x] = true;
		for (int i =0;i<=t1;i++){
		  if(graph[x][i] == 1){
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
		int res = 0;
		
		graph = new int[t1+1][t1+1];
		visit = new boolean[t1+1];
		

	    for(int i=0;i<t2;i++){
	    	st = new StringTokenizer(br.readLine());
	    	int u = Integer.parseInt(st.nextToken());
	    	int v = Integer.parseInt(st.nextToken());
	    	
	    	graph[u][v] = 1;
	    	graph[v][u] = 1;
	    }
	    
	    for(int i=1;i <= t1;i++){
	    	if(!visit[i]){
	    		res++;
	    		dfs(i);
	    	}
	    }
	    
	    System.out.println(res);
	    

	    

	}		
}
