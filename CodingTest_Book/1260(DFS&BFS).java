import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	private static int t1,t2,t3;
	private static ArrayList<Integer>[] graph;
	private static boolean[] visited;
	
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
	
	private static void bfs(int n){
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		visited[n] = true;
		
		while(!q.isEmpty()){
			int x = q.poll();
			System.out.print(x + " ");
			
			for(int i : graph[x]){
				if(!visited[i]){
					visited[i] = true;
					q.offer(i);
				}
			}
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
		
		//정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하기 위한 sort
		for(int i = 1; i<= t1; i++){
			Collections.sort(graph[i]);
		}
		
		/*
		//출력
		for (int i = 1; i <= t1; i++) {
            	System.out.print("graph[" + i + "] -> ");
            	for (int j : graph[i]) {
                	System.out.print(j + " ");
            	}
            	System.out.println();
        	}
        	*/	
		
		dfs(t3);
		visited = new boolean[t1+1];
		System.out.print("\n");
		bfs(t3);
		
		
		
	}
}
