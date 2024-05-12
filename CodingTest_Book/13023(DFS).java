import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	static int t1,t2;
	static boolean arrive = false;  //깊이가 5가 될 경우 true
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	
	private static void dfs(int n , int depth){
		if(depth == 5 || arrive){
			arrive = true;
			return;	
		} 
		visited[n] = true;
	
		for(int i : graph[n]){
		 if(!visited[i]){
			dfs(i,depth+1);
			}
		}
		visited[n] = false;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    t1 = Integer.parseInt(st.nextToken());
	    t2 = Integer.parseInt(st.nextToken());
	    
		graph = new ArrayList[t1];
		visited = new boolean[t1];
		
		for(int i=0; i< t1;i++){
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

		/*
		//출력
		for (int i = 0; i < t1; i++) {
            	System.out.print("graph[" + i + "] -> ");
            	for (int j : graph[i]) {
                	System.out.print(j + " ");
            	}
            	System.out.println();
        	}
        	*/
		
		
		for(int i=0;i<t1;i++){
			dfs(i,1);
			if(arrive) break;
		}
		
		if(arrive){
			System.out.println(1);
		}
		else System.out.println(0);		        
        
	}
}
